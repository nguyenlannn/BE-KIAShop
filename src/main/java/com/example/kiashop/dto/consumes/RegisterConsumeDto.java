package com.example.kiashop.dto.consumes;

import com.example.kiashop.entities.UserEntity;
import com.example.kiashop.enums.GenderEnum;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterConsumeDto {

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private GenderEnum gender;

    public UserEntity toUserEntity() {
        return UserEntity.builder()
                .username(username)
                .password(password)
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .gender(gender)
                .build();
    }
}
