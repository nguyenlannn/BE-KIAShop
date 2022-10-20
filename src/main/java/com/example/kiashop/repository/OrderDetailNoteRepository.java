package com.example.kiashop.repository;

import com.example.kiashop.entities.OrderDetailNoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailNoteRepository extends JpaRepository<OrderDetailNoteEntity, Long> {
}
