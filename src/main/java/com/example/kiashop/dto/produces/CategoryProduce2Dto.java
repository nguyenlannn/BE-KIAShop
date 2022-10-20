package com.example.kiashop.dto.produces;

import com.example.kiashop.bases.BaseProduceDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CategoryProduce2Dto extends BaseProduceDto<Long> {

    private String name;

    private Long parentId;
}
