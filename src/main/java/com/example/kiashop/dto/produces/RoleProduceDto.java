package com.example.kiashop.dto.produces;

import com.example.kiashop.bases.BaseProduceDto;
import com.example.kiashop.entities.RoleEntity;
import com.example.kiashop.entities.UserEntity;
import com.example.kiashop.enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RoleProduceDto extends BaseProduceDto<Long> {

    private RoleEnum name;

    private List<UserProduceDto> users;
}
