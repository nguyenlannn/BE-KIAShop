package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.ProductImageProduceDto;
import com.example.kiashop.entities.ProductImageEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-20T22:58:40+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (Amazon.com Inc.)"
)
@Component
public class ProductImageMapperImpl extends ProductImageMapper {

    @Override
    public ProductImageProduceDto toProductImageProduceDto(ProductImageEntity productImageEntity) {
        if ( productImageEntity == null ) {
            return null;
        }

        ProductImageProduceDto.ProductImageProduceDtoBuilder<?, ?> productImageProduceDto = ProductImageProduceDto.builder();

        productImageProduceDto.id( productImageEntity.getId() );
        productImageProduceDto.createdDate( map( productImageEntity.getCreatedDate() ) );
        productImageProduceDto.updatedDate( map( productImageEntity.getUpdatedDate() ) );
        productImageProduceDto.path( productImageEntity.getPath() );

        return productImageProduceDto.build();
    }
}
