package com.example.kiashop.entities;

import com.example.kiashop.bases.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity(name = "product_comments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ProductCommentEntity extends BaseEntity {

    @Column(columnDefinition = "text")
    private String content;

    @ManyToOne
    @JoinColumn(columnDefinition = "parent_id")
    private ProductCommentEntity productComment;

    @OneToMany(mappedBy = "productComment")
    private List<ProductCommentEntity> productComments;
    @ManyToOne
    @JoinColumn(columnDefinition = "product_id")
    private ProductEntity product;

    @ManyToOne
    @JoinColumn(columnDefinition = "user_id")
    private UserEntity user;
}
