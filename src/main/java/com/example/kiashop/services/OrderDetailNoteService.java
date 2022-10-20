package com.example.kiashop.services;

import com.example.kiashop.dto.consumes.OrderDetailNoteConsumeDto;
import com.example.kiashop.dto.produces.OrderDetailNoteProduceDto;

public interface OrderDetailNoteService {

    OrderDetailNoteProduceDto editOrderDetailNote(Long id, OrderDetailNoteConsumeDto orderNoteConsumeDto);

    OrderDetailNoteProduceDto addOrderDetailNote(Long id, OrderDetailNoteConsumeDto orderNoteConsumeDto);

    void deleteOrderDetailNote(Long id);
}
