package com.example.kiashop.repository;

import com.example.kiashop.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);

    UserEntity findByUsernameOrEmail(String username,String email);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    UserEntity findByEmail(String email);
}
