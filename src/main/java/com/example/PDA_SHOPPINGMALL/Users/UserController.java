package com.example.PDA_SHOPPINGMALL.Users;

import com.example.PDA_SHOPPINGMALL.Products.utils.ApiUtils;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.example.PDA_SHOPPINGMALL.Products.utils.ApiUtils.error;
import static com.example.PDA_SHOPPINGMALL.Products.utils.ApiUtils.success;
import static com.example.PDA_SHOPPINGMALL.Users.User.fromDtoToEntity;

@RestController
@AllArgsConstructor
@Slf4j
public class UserController {

    UserService userService;

    @PostMapping("/user/signup")

    public ApiUtils.ApiResult signUp(@Valid @RequestBody UserDTO userDTO, Errors errors){


            if(errors.hasErrors()){

                String message = errors.getFieldError().getDefaultMessage();
                return error(message, HttpStatus.BAD_REQUEST);

            }else{

                if(checkId(userDTO)) {
                    return error("아이디 중복", HttpStatus.CONFLICT);
                }

                User requestUser = fromDtoToEntity(userDTO);
                String userId = userService.signUp(requestUser);
                log.info(userId);
                return success(userId);

            }

            /*

            }*/

    }

    /**@PostMapping("/user/login")
    public ResponseFormat login(@RequestBody User user){

        return new
    }**/

    @GetMapping("/datasource")
    public void makeConnection(){
        userService.makeConnection();
    }

    public boolean checkId(UserDTO userDTO){
        return userService.checkId(userDTO.getUserId());
    }










}

