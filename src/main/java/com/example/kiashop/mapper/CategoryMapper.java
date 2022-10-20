package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.CategoryProduceDto;
import com.example.kiashop.entities.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class CategoryMapper implements CustomMapper {

    @Mapping(target = "categories1", ignore = true)
    public abstract CategoryProduceDto toCategoryProduceDto(CategoryEntity categoryEntity);
}
