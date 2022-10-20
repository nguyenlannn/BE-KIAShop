package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.ProductImageProduceDto;
import com.example.kiashop.entities.ProductImageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ProductImageMapper implements CustomMapper{

    @Mapping(target = "product", ignore = true)
    public abstract ProductImageProduceDto toProductImageProduceDto(ProductImageEntity productImageEntity);
}
