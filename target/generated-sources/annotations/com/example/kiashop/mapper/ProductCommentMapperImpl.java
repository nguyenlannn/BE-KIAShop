package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.ProductCommentProduceDto;
import com.example.kiashop.entities.ProductCommentEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-20T22:52:55+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (Amazon.com Inc.)"
)
@Component
public class ProductCommentMapperImpl extends ProductCommentMapper {

    @Override
    public ProductCommentProduceDto toProductCommentProduceDto(ProductCommentEntity productCommentEntity) {
        if ( productCommentEntity == null ) {
            return null;
        }

        ProductCommentProduceDto.ProductCommentProduceDtoBuilder<?, ?> productCommentProduceDto = ProductCommentProduceDto.builder();

        productCommentProduceDto.id( productCommentEntity.getId() );
        productCommentProduceDto.createdDate( map( productCommentEntity.getCreatedDate() ) );
        productCommentProduceDto.updatedDate( map( productCommentEntity.getUpdatedDate() ) );
        productCommentProduceDto.content( productCommentEntity.getContent() );
        productCommentProduceDto.parentId( productCommentEntity.getParentId() );
        productCommentProduceDto.createdBy( productCommentEntity.getCreatedBy() );

        return productCommentProduceDto.build();
    }
}
