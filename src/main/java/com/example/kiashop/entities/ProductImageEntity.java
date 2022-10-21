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

@Entity(name = "product_images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ProductImageEntity extends BaseEntity {

    private String path;

    @ManyToOne
    @JoinColumn(columnDefinition = "product_id")
    private ProductEntity product;
}
