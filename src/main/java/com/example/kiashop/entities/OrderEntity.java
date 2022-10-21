package com.example.kiashop.entities;

import com.example.kiashop.bases.BaseEntity;
import com.example.kiashop.enums.OrderStatusEnum;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class OrderEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private OrderStatusEnum status;

    @ManyToOne
    @JoinColumn(columnDefinition = "user_id")
    private UserEntity user;

    @OneToMany(mappedBy = "order")
    private Collection<OrderDetailEntity> orderDetails;
}
