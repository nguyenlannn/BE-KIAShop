package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.OrderDetailNoteProduceDto;
import com.example.kiashop.entities.OrderDetailNoteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class OrderDetailNoteMapper implements CustomMapper {

    @Mapping(target = "orderDetail", ignore = true)
    public abstract OrderDetailNoteProduceDto toOrderNoteProduceDto(OrderDetailNoteEntity orderNoteEntity);
}
