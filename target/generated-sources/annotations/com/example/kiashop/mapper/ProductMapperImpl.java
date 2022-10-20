package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.ProductProduceDto;
import com.example.kiashop.entities.ProductEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-20T22:58:40+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (Amazon.com Inc.)"
)
@Component
public class ProductMapperImpl extends ProductMapper {

    @Override
    public ProductProduceDto toProductProduceDto(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        ProductProduceDto.ProductProduceDtoBuilder<?, ?> productProduceDto = ProductProduceDto.builder();

        productProduceDto.id( productEntity.getId() );
        productProduceDto.createdDate( map( productEntity.getCreatedDate() ) );
        productProduceDto.updatedDate( map( productEntity.getUpdatedDate() ) );
        productProduceDto.name( productEntity.getName() );
        productProduceDto.price( productEntity.getPrice() );
        productProduceDto.discount( productEntity.getDiscount() );
        productProduceDto.status( productEntity.getStatus() );
        productProduceDto.style( productEntity.getStyle() );
        productProduceDto.gender( productEntity.getGender() );
        productProduceDto.origin( productEntity.getOrigin() );
        productProduceDto.material( productEntity.getMaterial() );
        productProduceDto.productionMethod( productEntity.getProductionMethod() );
        productProduceDto.size( productEntity.getSize() );
        productProduceDto.accessory( productEntity.getAccessory() );
        productProduceDto.washingMethod( productEntity.getWashingMethod() );
        productProduceDto.description( productEntity.getDescription() );

        return productProduceDto.build();
    }
}
