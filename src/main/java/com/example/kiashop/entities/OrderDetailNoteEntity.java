package com.example.kiashop.entities;

import com.example.kiashop.bases.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "order_detail_notes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class OrderDetailNoteEntity extends BaseEntity {

    @Column(columnDefinition = "text")
    private String content;

    @ManyToOne
    @JoinColumn(columnDefinition = "order_detail_id")
    private OrderDetailEntity orderDetail;
}
