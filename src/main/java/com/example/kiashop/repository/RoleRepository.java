package com.example.kiashop.repository;

import com.example.kiashop.entities.RoleEntity;
import com.example.kiashop.enums.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    Collection<RoleEntity> findByName(RoleEnum roleEnum);
}
