package com.example.kiashop.entities;

import com.example.kiashop.bases.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ProductEntity extends BaseEntity {

    private String name;

    private BigDecimal price;

    private Integer discount;

    @Column(columnDefinition = "text")
    private String description;

    @OneToMany(mappedBy = "product")
    private List<OrderDetailEntity> orderDetails;

    @OneToMany(mappedBy = "product")
    private List<ProductImageEntity> productImages;

    @ManyToMany
    @JoinTable(
            name = "products_categories",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<CategoryEntity> categories;

    @OneToMany(mappedBy = "product")
    private List<ProductCommentEntity> productComments;
}
