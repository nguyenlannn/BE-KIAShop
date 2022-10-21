package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.CategoryProduceDto;
import com.example.kiashop.entities.CategoryEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-22T00:33:06+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (Amazon.com Inc.)"
)
@Component
public class CategoryMapperImpl extends CategoryMapper {

    @Override
    public CategoryProduceDto toCategoryProduceDto(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        CategoryProduceDto.CategoryProduceDtoBuilder<?, ?> categoryProduceDto = CategoryProduceDto.builder();

        categoryProduceDto.id( categoryEntity.getId() );
        categoryProduceDto.createdDate( map( categoryEntity.getCreatedDate() ) );
        categoryProduceDto.updatedDate( map( categoryEntity.getUpdatedDate() ) );
        categoryProduceDto.name( categoryEntity.getName() );

        return categoryProduceDto.build();
    }
}
