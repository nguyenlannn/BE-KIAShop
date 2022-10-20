package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.DeviceProduceDto;
import com.example.kiashop.entities.DeviceEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-20T22:52:55+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (Amazon.com Inc.)"
)
@Component
public class DeviceMapperImpl extends DeviceMapper {

    @Override
    public DeviceProduceDto toDeviceProduceDto(DeviceEntity deviceEntity) {
        if ( deviceEntity == null ) {
            return null;
        }

        DeviceProduceDto.DeviceProduceDtoBuilder<?, ?> deviceProduceDto = DeviceProduceDto.builder();

        deviceProduceDto.id( deviceEntity.getId() );
        deviceProduceDto.createdDate( map( deviceEntity.getCreatedDate() ) );
        deviceProduceDto.updatedDate( map( deviceEntity.getUpdatedDate() ) );
        deviceProduceDto.userAgent( deviceEntity.getUserAgent() );

        return deviceProduceDto.build();
    }
}
