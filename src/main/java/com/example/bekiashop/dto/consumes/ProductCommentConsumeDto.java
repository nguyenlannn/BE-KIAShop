package com.example.bekiashop.dto.consumes;

import com.example.bekiashop.entities.ProductCommentEntity;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCommentConsumeDto implements Serializable {

    private String content;

    private Long parentId;

    private Long productId;

    private Long userId;

    public ProductCommentEntity toProductCommentEntity() {
        return ProductCommentEntity.builder()
                .content(content)
                .parentId(parentId)
                .build();
    }
}
