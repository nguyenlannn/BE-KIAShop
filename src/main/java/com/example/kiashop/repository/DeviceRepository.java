package com.example.kiashop.repository;

import com.example.kiashop.entities.DeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<DeviceEntity, Long> {

    DeviceEntity findByUserAgentAndUserId(String userAgent, Long userId);
}
