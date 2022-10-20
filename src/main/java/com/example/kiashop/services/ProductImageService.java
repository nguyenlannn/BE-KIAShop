package com.example.kiashop.services;

import com.example.kiashop.dto.produces.ProductImageProduceDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ProductImageService {

    ProductImageProduceDto addProductImage(Long id, MultipartFile multipartFile) throws IOException;

    ProductImageProduceDto editProductImage(Long id, MultipartFile multipartFile) throws IOException;

    void deleteProductImage(Long id);
}
