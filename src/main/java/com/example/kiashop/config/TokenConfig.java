package com.example.kiashop.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.kiashop.dto.produces.TokenProduceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TokenConfig {

    @Value("${jwt.secret}")
    private String JWT_SECRET;

    @Value("${jwt.access.token.validity}")
    private Long JWT_ACCESS_TOKEN_VALIDITY;

    @Value("${jwt.refresh.token.validity}")
    private Long JWT_REFRESH_TOKEN_VALIDITY;

    private final HttpServletRequest request;

    public TokenProduceDto generateToken(UserDetails userDetails, Long userId) {
        Algorithm algorithm = Algorithm.HMAC256(JWT_SECRET.getBytes());
        return TokenProduceDto.builder()
                .accessToken(JWT.create()
                        .withSubject(userDetails.getUsername())
                        .withExpiresAt(new Date(System.currentTimeMillis() + JWT_ACCESS_TOKEN_VALIDITY))
                        .withIssuer(request.getRequestURL().toString())
                        .withClaim("roles", userDetails.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                        .withClaim("id", userId)
                        .sign(algorithm))
                .refreshToken(JWT.create()
                        .withSubject(userDetails.getUsername())
                        .withExpiresAt(new Date(System.currentTimeMillis() + JWT_REFRESH_TOKEN_VALIDITY))
                        .withIssuer(request.getRequestURL().toString())
                        .withClaim("id", userId)
                        .sign(algorithm))
                .build();
    }
}
