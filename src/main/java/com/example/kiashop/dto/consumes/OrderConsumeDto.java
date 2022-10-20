package com.example.kiashop.dto.consumes;

import com.example.kiashop.enums.OrderStatusEnum;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderConsumeDto implements Serializable {

    private List<OrderDetailConsumeDto> orderDetails;
    private OrderStatusEnum status;
}
