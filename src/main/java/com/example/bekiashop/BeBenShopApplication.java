package com.example.bekiashop;

import com.example.bekiashop.entities.RoleEntity;
import com.example.bekiashop.entities.UserEntity;
import com.example.bekiashop.enums.RoleEnum;
import com.example.bekiashop.services.impl.RoleServiceImpl;
import com.example.bekiashop.services.impl.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeBenShopApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BeBenShopApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BeBenShopApplication.class);
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
                        .build());
            } catch (Exception ignored) {
            }
        };
    }
}
