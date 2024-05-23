package com.example.PDA_SHOPPINGMALL.Products;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class ProductRepository {

    HashMap<String, Product> productTable = new HashMap<>();
    @Autowired
    EntityManager entityManager;

    //상품 조회 (1: 상세,  2: 카테고리, 3: 전체)
    public Product findProduct(int id){

        return entityManager.find(Product.class, id);
    }
    public List<Product> readAllProduct(int limit, int currentPage){
        int startPosition = currentPage * limit;
        return entityManager.createQuery("select p from Product p", Product.class)
                .setFirstResult(startPosition)
                .setMaxResults(limit)
                .getResultList();
    }

    //카테고리별 검색
    public List<Product> readAllProduct(int limit, int currentPage, Integer categoryId){
        int startPosition = currentPage * limit;
        return entityManager.createQuery("select p from Product p WHERE p.categoryId = : categoryId", Product.class)
                .setFirstResult(startPosition)
                .setMaxResults(limit)
                .setParameter("categoryId", categoryId)
                .getResultList();

    }


    // 상품 등록
    public void createProduct(Product product){
        entityManager.persist(product);
    }

    //상품 삭제
    public void deleteProduct(int id) {
        productTable.remove(id);
    }

    public void deleteProducts(List<Integer> deleteId) {
        for(int i=0; i<deleteId.size(); i++){
            productTable.remove(deleteId.get(i));
        }
    }
}
