package com.example.kiashop.repository;

import com.example.kiashop.entities.ProductImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImageRepository extends JpaRepository<ProductImageEntity, Long> {

   Boolean existsByPath(String path);
}