package com.example.kiashop.services.impl;

import com.example.kiashop.dto.consumes.OrderDetailNoteConsumeDto;
import com.example.kiashop.dto.produces.OrderDetailNoteProduceDto;
import com.example.kiashop.entities.OrderDetailEntity;
import com.example.kiashop.entities.OrderDetailNoteEntity;
import com.example.kiashop.enums.OrderStatusEnum;
import com.example.kiashop.exceptions.BadRequestException;
import com.example.kiashop.exceptions.ForbiddenException;
import com.example.kiashop.mapper.OrderDetailNoteMapper;
import com.example.kiashop.repository.OrderDetailNoteRepository;
import com.example.kiashop.repository.OrderDetailRepository;
import com.example.kiashop.services.OrderDetailNoteService;
import com.example.kiashop.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderDetailNoteServiceImpl implements OrderDetailNoteService {

    private final OrderDetailNoteRepository mOrderDetailNoteRepository;
    private final OrderDetailNoteMapper mOrderDetailNoteMapper;
    private final UserService mUserService;
    private final OrderDetailRepository mOrderDetailRepository;

    @Override
    public OrderDetailNoteProduceDto editOrderDetailNote(Long id, OrderDetailNoteConsumeDto orderNoteConsumeDto) {
        OrderDetailNoteEntity orderDetailNoteEntity = mOrderDetailNoteRepository.findById(id).orElse(null);
        if (orderDetailNoteEntity == null) {
            throw new BadRequestException("Order note does not  exist");
        }
        if (!orderDetailNoteEntity.getCreatedBy().equals(mUserService.getUserName())
                || (!orderDetailNoteEntity.getOrderDetail().getOrder().getStatus().equals(OrderStatusEnum.PENDING)
                && !mUserService.isRoleAdmin())) {
            throw new ForbiddenException("Forbidden");
        }
        orderDetailNoteEntity.setContent(orderNoteConsumeDto.toOrderNoteEntity().getContent());
        return mOrderDetailNoteMapper.toOrderNoteProduceDto(mOrderDetailNoteRepository.save(orderDetailNoteEntity));
    }

    @Override
    public OrderDetailNoteProduceDto addOrderDetailNote(Long id, OrderDetailNoteConsumeDto orderNoteConsumeDto) {
        OrderDetailEntity orderDetailEntity = mOrderDetailRepository.findById(id).orElse(null);
        if (orderDetailEntity == null) {
            throw new BadRequestException("order detail does not exist");
        }
        return mOrderDetailNoteMapper.toOrderNoteProduceDto(mOrderDetailNoteRepository.save(OrderDetailNoteEntity.builder()
                .content(orderNoteConsumeDto.getContent())
                .orderDetail(orderDetailEntity)
                .build()));
    }

    @Override
    public void deleteOrderDetailNote(Long id) {
        OrderDetailNoteEntity orderDetailNoteEntity = mOrderDetailNoteRepository.findById(id).orElse(null);
        if (orderDetailNoteEntity == null) {
            throw new BadRequestException("order detail note does not exist");
        }
        if (!orderDetailNoteEntity.getCreatedBy().equals(mUserService.getUserName())) {
            throw new ForbiddenException("Forbidden");
        }
        mOrderDetailNoteRepository.deleteById(id);
    }
}
