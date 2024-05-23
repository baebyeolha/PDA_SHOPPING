package com.example.PDA_SHOPPINGMALL.Users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    Integer id;
    @NotBlank(message ="아이디가 입력되지 않았습니다.")
    String userId;
    @NotBlank(message = "비밀번호가 입력되지 않았습니다.")
    @NotBlank //@Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}")
    String password;
    @NotBlank(message = "이름이 입력되지 않았습니다.")
    String name;
    @Email(message = "이메일 형식이 다릅니다")
    String email;
    @NotBlank(message = "연락처가 입력되지 않았습니다.")
    String contact;

    //TODO DTO-> Entity 코드 추가


}
