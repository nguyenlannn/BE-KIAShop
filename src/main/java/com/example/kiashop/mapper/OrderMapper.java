package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.OrderProduceDto;
import com.example.kiashop.entities.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class OrderMapper implements CustomMapper{

    @Mapping(target = "orderDetails", ignore = true)
    @Mapping(target = "user", ignore = true)
    public abstract OrderProduceDto toOrderProduceDto(OrderEntity orderEntity);
}