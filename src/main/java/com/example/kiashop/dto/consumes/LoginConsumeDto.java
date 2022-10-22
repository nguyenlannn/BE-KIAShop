package com.example.kiashop.dto.consumes;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginConsumeDto {

    private String username;

    private String password;
}
