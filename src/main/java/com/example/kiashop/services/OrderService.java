package com.example.kiashop.services;

import com.example.kiashop.bases.BaseListProduceDto;
import com.example.kiashop.dto.consumes.OrderConsumeDto;
import com.example.kiashop.dto.produces.OrderProduceDto;
import com.example.kiashop.enums.OrderStatusEnum;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface OrderService {

    OrderProduceDto createOrder(OrderConsumeDto orderConsumeDto);

    OrderProduceDto cancelOrder(Long id);

    OrderProduceDto getOrderById(Long id);

    BaseListProduceDto<OrderProduceDto> searchOrder(
            String orderStatusEnum
            , Long orderId
            , Optional<Long> startTime
            , Optional<Long> endTime
            , Pageable pageable);

    OrderProduceDto getById(Long id);

    Long totalRevenue(
            String orderStatusEnum
            , Long orderId
            , Optional<Long> startTime
            , Optional<Long> endTime);

    OrderProduceDto updateStatusAdmin(Long id, OrderStatusEnum orderStatusEnum);
}
