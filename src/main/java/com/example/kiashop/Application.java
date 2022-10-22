package com.example.kiashop;

import com.example.kiashop.entities.RoleEntity;
import com.example.kiashop.entities.UserEntity;
import com.example.kiashop.enums.RoleEnum;
import com.example.kiashop.services.impl.RoleServiceImpl;
import com.example.kiashop.services.impl.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @Bean
    CommandLineRunner run(RoleServiceImpl mRoleService, UserServiceImpl mUserService) {
        return args -> {
            try {
                mRoleService.create(RoleEntity.builder().name(RoleEnum.ROLE_ADMIN).build());
                mRoleService.create(RoleEntity.builder().name(RoleEnum.ROLE_USER).build());
            } catch (Exception ignored) {
            }
            try {
                mUserService.createAdmin(UserEntity.builder()
                        .username("admin")
                        .password("123")
                        .email("cuongnh2k@gmail.com")
                        .build());
            } catch (Exception ignored) {
            }
        };
    }
}
