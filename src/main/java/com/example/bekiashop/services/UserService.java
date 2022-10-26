package com.example.bekiashop.services;


import com.example.bekiashop.dto.consumes.UserConsumeDto;
import com.example.bekiashop.dto.produces.UserProduceDto;
import com.example.bekiashop.entities.UserEntity;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public interface UserService {

    void createAdmin(UserEntity userEntity);

    String getUserName();

    Boolean isRoleAdmin();

    UserEntity getCurrentUser();

    UserProduceDto getUserDetail();

    UserProduceDto createRegister(UserConsumeDto userConsumeDto);

    UserProduceDto editUser(HashMap<String, Object> map);

    void resetPassword(String username) throws MessagingException;

    UserProduceDto editPasswordOrMail(HashMap<String, Object> map, HttpServletRequest request);
}
