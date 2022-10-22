package com.example.kiashop.exceptions;

import com.example.kiashop.bases.BaseResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<BaseResponseDto> MyException(RuntimeException e) {
        if (e instanceof BadRequestException) {
            return new ResponseEntity<>(BaseResponseDto.error(e.getMessage(), 400), HttpStatus.BAD_REQUEST);
        } else if (e instanceof UnauthorizedException) {
            return new ResponseEntity<>(BaseResponseDto.error(e.getMessage(), 401), HttpStatus.UNAUTHORIZED);
        } else if (e instanceof ForbiddenException) {
            return new ResponseEntity<>(BaseResponseDto.error(e.getMessage(), 403), HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<>(BaseResponseDto.error(e.getMessage(), 500), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<BaseResponseDto> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new ResponseEntity<>(BaseResponseDto.error("Bad value", 400, errors), HttpStatus.BAD_REQUEST);
    }
}
