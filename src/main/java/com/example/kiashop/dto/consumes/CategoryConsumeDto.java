package com.example.kiashop.dto.consumes;

import com.example.kiashop.entities.CategoryEntity;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CategoryConsumeDto implements Serializable {

    private String name;

    private Long parentId;

    public CategoryEntity toCategoryEntity() {
        return CategoryEntity.builder()
                .name(name)
//                .parentId(parentId)
                .build();
    }
}
