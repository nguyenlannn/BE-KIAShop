package com.example.kiashop.dto.produces;

import com.example.kiashop.bases.BaseProduceDto;
import com.example.kiashop.enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class UserProduceDto extends BaseProduceDto<Long> {

    private String username;

    private String email;

    private String firstName;

    private String lastName;

    private String avatar;

    private GenderEnum gender;

    private List<DeviceProduceDto> devices;

    private List<OrderProduceDto> orders;

    private List<RoleProduceDto> roles;

    private List<ProductCommentProduceDto> productComments;
}