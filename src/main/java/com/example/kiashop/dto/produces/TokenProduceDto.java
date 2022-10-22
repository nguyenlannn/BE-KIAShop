package com.example.kiashop.dto.produces;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TokenProduceDto {

    private String accessToken;

    private String refreshToken;
}
