package com.example.kiashop.services;

import com.example.kiashop.dto.consumes.CategoryConsumeDto;
import com.example.kiashop.dto.produces.CategoryProduceDto;

import java.util.HashMap;
import java.util.List;

public interface CategoryService {

    List<CategoryProduceDto> getAll(Boolean structure);

    void deleteById(Long id);

    CategoryProduceDto addCategory(CategoryConsumeDto categoryConsumeDto);

    CategoryProduceDto editById(Long id, HashMap<String, Object> map);

    CategoryProduceDto getById(Long id);
}