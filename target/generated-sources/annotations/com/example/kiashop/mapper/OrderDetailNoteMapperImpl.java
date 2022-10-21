package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.OrderDetailNoteProduceDto;
import com.example.kiashop.entities.OrderDetailNoteEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-22T00:33:06+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (Amazon.com Inc.)"
)
@Component
public class OrderDetailNoteMapperImpl extends OrderDetailNoteMapper {

    @Override
    public OrderDetailNoteProduceDto toOrderNoteProduceDto(OrderDetailNoteEntity orderNoteEntity) {
        if ( orderNoteEntity == null ) {
            return null;
        }

        OrderDetailNoteProduceDto.OrderDetailNoteProduceDtoBuilder<?, ?> orderDetailNoteProduceDto = OrderDetailNoteProduceDto.builder();

        orderDetailNoteProduceDto.id( orderNoteEntity.getId() );
        orderDetailNoteProduceDto.createdDate( map( orderNoteEntity.getCreatedDate() ) );
        orderDetailNoteProduceDto.updatedDate( map( orderNoteEntity.getUpdatedDate() ) );
        orderDetailNoteProduceDto.content( orderNoteEntity.getContent() );
        orderDetailNoteProduceDto.createdBy( orderNoteEntity.getCreatedBy() );

        return orderDetailNoteProduceDto.build();
    }
}
