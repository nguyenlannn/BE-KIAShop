package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.UserProduceDto;
import com.example.kiashop.entities.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-22T00:33:06+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl extends UserMapper {

    @Override
    public UserProduceDto toUserProduceDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserProduceDto.UserProduceDtoBuilder<?, ?> userProduceDto = UserProduceDto.builder();

        userProduceDto.id( userEntity.getId() );
        userProduceDto.createdDate( map( userEntity.getCreatedDate() ) );
        userProduceDto.updatedDate( map( userEntity.getUpdatedDate() ) );
        userProduceDto.username( userEntity.getUsername() );
        userProduceDto.email( userEntity.getEmail() );
        userProduceDto.firstName( userEntity.getFirstName() );
        userProduceDto.lastName( userEntity.getLastName() );
        userProduceDto.avatar( userEntity.getAvatar() );
        userProduceDto.gender( userEntity.getGender() );

        return userProduceDto.build();
    }
}
