package com.example.PDA_SHOPPINGMALL.Users;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {


    @Autowired
    DataSource dataSource;

    @Autowired
    EntityManager entityManager;

    public void makeConnection(){
        DataSourceUtils.getConnection(dataSource);
    }
    Map<String, User> userTable = new HashMap<>();


    public void save(User user){
        /*userTable.put(user.getUserId(),user);
        User savedUser = userTable.get(user.getUserId());*/

        entityManager.persist(user);

    }

    public User FindById(Integer id){
        return entityManager.find(User.class, id);

    }


    public User findByUserId(String userId) {
        String jpql = "SELECT u FROM User u WHERE u.userId = :userId";
        try {
            return entityManager.createQuery(jpql, User.class)
                    .setParameter("userId", userId)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }


}

