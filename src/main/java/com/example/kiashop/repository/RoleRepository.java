package com.example.kiashop.repository;

import com.example.kiashop.entities.RoleEntity;
import com.example.kiashop.enums.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    List<RoleEntity> findByName(RoleEnum roleEnum);
}
