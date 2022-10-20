package com.example.kiashop.mapper;


import com.example.kiashop.dto.produces.DeviceProduceDto;
import com.example.kiashop.entities.DeviceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class DeviceMapper implements CustomMapper {

    @Mapping(target = "user", ignore = true)
    public abstract DeviceProduceDto toDeviceProduceDto(DeviceEntity deviceEntity);
}
