package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.ProductCommentProduceDto;
import com.example.kiashop.entities.ProductCommentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ProductCommentMapper implements CustomMapper {

    @Mapping(target = "product", ignore = true)
    @Mapping(target = "user", ignore = true)
    @Mapping(target = "productComment1", ignore = true)
    public abstract ProductCommentProduceDto toProductCommentProduceDto(ProductCommentEntity productCommentEntity);
}
