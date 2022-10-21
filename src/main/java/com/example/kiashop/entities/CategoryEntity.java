package com.example.kiashop.entities;

import com.example.kiashop.bases.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity(name = "categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CategoryEntity extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(columnDefinition = "parent_id")
    private CategoryEntity category;

    @OneToMany(mappedBy = "category")
    private List<CategoryEntity> categories;

    @ManyToMany(mappedBy = "categories")
    private List<ProductEntity> products;
}
