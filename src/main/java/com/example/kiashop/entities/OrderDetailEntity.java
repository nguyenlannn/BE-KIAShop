package com.example.kiashop.entities;

import com.example.kiashop.bases.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity(name = "order_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class OrderDetailEntity extends BaseEntity {

    private Integer quantity;

    private BigDecimal price;

    private Integer discount;

    @ManyToOne
    @JoinColumn(columnDefinition = "order_id")
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(columnDefinition = "product_id")
    private ProductEntity product;

    @OneToMany(mappedBy = "orderDetail")
    private List<OrderDetailNoteEntity> orderDetailNotes;
}
