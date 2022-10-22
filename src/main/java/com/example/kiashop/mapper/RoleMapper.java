package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.RoleProduceDto;
import com.example.kiashop.entities.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class RoleMapper implements CustomMapper{
    @Mapping(target = "users", ignore = true)
    public abstract RoleProduceDto toRoleProduceDto(RoleEntity roleEntity);
}
