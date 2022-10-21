package com.example.kiashop.bases;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
public abstract class BaseProduceDto<ID> {

    private ID id;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date createdDate;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date updatedDate;
}