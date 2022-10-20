package com.example.kiashop.mapper;

import com.example.kiashop.dto.produces.RoleProduceDto;
import com.example.kiashop.entities.RoleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class RoleMapper implements CustomMapper{

    public abstract RoleProduceDto toRoleProduceDto(RoleEntity roleEntity);
}
