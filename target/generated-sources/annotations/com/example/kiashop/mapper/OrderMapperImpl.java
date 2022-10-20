package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.OrderProduceDto;
import com.example.kiashop.entities.OrderEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-20T22:52:55+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (Amazon.com Inc.)"
)
@Component
public class OrderMapperImpl extends OrderMapper {

    @Override
    public OrderProduceDto toOrderProduceDto(OrderEntity orderEntity) {
        if ( orderEntity == null ) {
            return null;
        }

        OrderProduceDto.OrderProduceDtoBuilder<?, ?> orderProduceDto = OrderProduceDto.builder();

        orderProduceDto.id( orderEntity.getId() );
        orderProduceDto.createdDate( map( orderEntity.getCreatedDate() ) );
        orderProduceDto.updatedDate( map( orderEntity.getUpdatedDate() ) );
        orderProduceDto.status( orderEntity.getStatus() );

        return orderProduceDto.build();
    }
}
