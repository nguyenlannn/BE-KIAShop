package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.RoleProduceDto;
import com.example.kiashop.entities.RoleEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-20T22:58:41+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (Amazon.com Inc.)"
)
@Component
public class RoleMapperImpl extends RoleMapper {

    @Override
    public RoleProduceDto toRoleProduceDto(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        RoleProduceDto.RoleProduceDtoBuilder<?, ?> roleProduceDto = RoleProduceDto.builder();

        roleProduceDto.id( roleEntity.getId() );
        roleProduceDto.createdDate( map( roleEntity.getCreatedDate() ) );
        roleProduceDto.updatedDate( map( roleEntity.getUpdatedDate() ) );
        roleProduceDto.name( roleEntity.getName() );

        return roleProduceDto.build();
    }
}
