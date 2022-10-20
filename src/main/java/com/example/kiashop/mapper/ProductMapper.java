package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.ProductProduceDto;
import com.example.kiashop.entities.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ProductMapper implements CustomMapper {

    @Mapping(target = "orderDetails", ignore = true)
    @Mapping(target = "productImages", ignore = true)
    @Mapping(target = "categories", ignore = true)
    @Mapping(target = "productComments", ignore = true)
    public abstract ProductProduceDto toProductProduceDto(ProductEntity productEntity);
}
