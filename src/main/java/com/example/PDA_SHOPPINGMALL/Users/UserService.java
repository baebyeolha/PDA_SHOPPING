package com.example.PDA_SHOPPINGMALL.Users;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UserService {

    UserRepository userRepository;
    UserRepo userRepo;
    @Transactional
    public String signUp(User user){
        userRepository.save(user);
        //return userRepository.findByUserId(user.getUserId()).getUserId();
        return userRepo.findByUserId(user.getUserId()).get().getUserId();
    }
    public boolean checkId(String userId) {
        User existMember= userRepository.findByUserId(userId);

        if (existMember == null)
            return false;
        else
            return true;
    }

    public void makeConnection() {
        userRepository.makeConnection();

    }
}
