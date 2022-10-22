package com.example.kiashop.services;


import com.example.kiashop.dto.consumes.RegisterConsumeDto;
import com.example.kiashop.dto.consumes.UserConsumeDto;
import com.example.kiashop.dto.produces.UserProduceDto;
import com.example.kiashop.entities.UserEntity;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public interface UserService {

    void createAdmin(UserEntity userEntity);

    String getUserName();

    Boolean isRoleAdmin();

    UserEntity getCurrentUser();

    UserProduceDto getUserDetail();

    UserProduceDto register(RegisterConsumeDto registerConsumeDto);

    UserProduceDto editUser(HashMap<String, Object> map);

    void resetPassword(String username) throws MessagingException;

    UserProduceDto editPasswordOrMail(HashMap<String, Object> map, HttpServletRequest request);
}
