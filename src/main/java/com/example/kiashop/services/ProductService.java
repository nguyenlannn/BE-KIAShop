package com.example.kiashop.services;

import com.example.kiashop.bases.BaseListProduceDto;
import com.example.kiashop.dto.consumes.ProductConsumeDto;
import com.example.kiashop.dto.produces.ProductProduceDto;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.HashMap;


public interface ProductService {

    ProductProduceDto createProduct(ProductConsumeDto productConsumeDto);

    ProductProduceDto editProduct(Long id, HashMap<String, Object> map);

    void deleteProductByID(Long id);

    ProductProduceDto getProductById(Long id);

    BaseListProduceDto<ProductProduceDto> searchByTitleOrDescription(
            String search
            , BigDecimal priceMin
            , BigDecimal priceMax
            , String categoryId
            , Long productId
            , Pageable pageable);

    BaseListProduceDto<ProductProduceDto> searchProductByProductId(Long id, Pageable pageable);
}
