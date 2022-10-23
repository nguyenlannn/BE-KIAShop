package com.example.kiashop.dto.consumes;

import com.example.kiashop.entities.UserEntity;
import com.example.kiashop.enums.GenderEnum;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterConsumeDto {

    @NotBlank
    @Length(max = 255)
    private String username;

    @NotBlank
    private String password;

    @Pattern(regexp = "^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+$")
    @Length(max = 255)
    private String email;
    @Length(max = 255)
    private String firstName;

    @Length(max = 255)
    private String lastName;

    @Pattern(regexp = "MALE|FEMALE|OTHER")
    private String gender;

    public UserEntity toUserEntity() {
        return UserEntity.builder()
                .username(username)
                .password(password)
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .gender(GenderEnum.valueOf(gender))
                .build();
    }
}
