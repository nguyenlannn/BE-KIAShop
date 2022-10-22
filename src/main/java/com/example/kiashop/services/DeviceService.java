package com.example.kiashop.services;

import com.example.kiashop.dto.produces.TokenProduceDto;
import com.example.kiashop.entities.UserEntity;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public interface DeviceService {

    void updateToken(TokenProduceDto tokenProduceDto, UserEntity userEntity) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException;

    TokenProduceDto refreshToken(HttpServletRequest request);

    void logouts(String ids);

    void logout(HttpServletRequest request);
}
