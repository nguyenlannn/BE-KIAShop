package com.example.kiashop.services;

import com.example.kiashop.bases.BaseListProduceDto;
import com.example.kiashop.dto.consumes.ProductCommentConsumeDto;
import com.example.kiashop.dto.produces.ProductCommentProduceDto;
import org.springframework.data.domain.Pageable;

public interface ProductCommentService {

    ProductCommentProduceDto createProductComment(ProductCommentConsumeDto productCommentConsumeDto, Long id);

    ProductCommentProduceDto editProductComment(ProductCommentConsumeDto productCommentConsumeDto, Long id);

    void deleteProductComment(Long id);

    BaseListProduceDto<ProductCommentProduceDto> getCommentByProductId(Long id, Pageable pageable);
}
