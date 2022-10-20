package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.OrderDetailProduceDto;
import com.example.kiashop.entities.OrderDetailEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-20T22:52:55+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (Amazon.com Inc.)"
)
@Component
public class OrderDetailMapperImpl extends OrderDetailMapper {

    @Override
    public OrderDetailProduceDto toOrderDetailProduceDto(OrderDetailEntity orderDetailEntity) {
        if ( orderDetailEntity == null ) {
            return null;
        }

        OrderDetailProduceDto.OrderDetailProduceDtoBuilder<?, ?> orderDetailProduceDto = OrderDetailProduceDto.builder();

        orderDetailProduceDto.id( orderDetailEntity.getId() );
        orderDetailProduceDto.createdDate( map( orderDetailEntity.getCreatedDate() ) );
        orderDetailProduceDto.updatedDate( map( orderDetailEntity.getUpdatedDate() ) );
        orderDetailProduceDto.quantity( orderDetailEntity.getQuantity() );
        orderDetailProduceDto.price( orderDetailEntity.getPrice() );
        orderDetailProduceDto.discount( orderDetailEntity.getDiscount() );

        return orderDetailProduceDto.build();
    }
}
