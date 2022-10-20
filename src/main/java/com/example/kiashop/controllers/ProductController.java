package com.example.kiashop.controllers;

import com.example.kiashop.bases.BaseController;
import com.example.kiashop.bases.BaseResponseDto;
import com.example.kiashop.dto.consumes.ProductCommentConsumeDto;
import com.example.kiashop.services.ProductCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("${base.api}/user/product/")
public class ProductController extends BaseController {

    private final ProductCommentService mProductCommentService;

    @PostMapping("{id}/comment")
    public ResponseEntity<BaseResponseDto> addProductComment(@PathVariable("id") Long id, @RequestBody ProductCommentConsumeDto productCommentConsumeDto) {
        return created(mProductCommentService.createProductComment(productCommentConsumeDto, id), "Create product comment successful");
    }

    @PatchMapping("comment/{id}")
    public ResponseEntity<BaseResponseDto> editProductComment(@PathVariable("id") Long id, @RequestBody ProductCommentConsumeDto productCommentConsumeDto) {
        return success(mProductCommentService.editProductComment(productCommentConsumeDto, id), "Update product comment successful");
    }

    @DeleteMapping("comment/{id}")
    public ResponseEntity<BaseResponseDto> deleteProductComment(@PathVariable("id") Long id) {
        mProductCommentService.deleteProductComment(id);
        return success("Delete product comment successful");
    }

}
