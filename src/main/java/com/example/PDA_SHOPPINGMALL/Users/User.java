package com.example.PDA_SHOPPINGMALL.Users;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id; // PK

    @NonNull
    private String userId;
    @NonNull
    private String password;
    @NonNull
    private String name;
    @Email
    private String email;
    @NonNull
    private String contact;

    public User( @NonNull String userId, @NonNull String password, @NonNull String name, @Email String email, @NonNull String contact) {

        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
        this.contact = contact;
    }



    public static User fromDtoToEntity(UserDTO userDTO){
        return new User(

                userDTO.getUserId(),
                userDTO.getPassword(),
                userDTO.getName(),
                userDTO.getEmail(),
                userDTO.getContact()
        );
    }




    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }




    Integer getID(){return id;}
    String getName(){return name;}
    String getUserId(){return userId;}
    String getPassword(){return password;}
    String getEmail(){return email;}
    String getContact(){return contact;}

}
