package com.me.dataentry.config;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.me.dataentry.dto.ErrorResponseDto;
import com.me.dataentry.dto.FieldValidationErrorDto;
import com.me.dataentry.exception.InvalidInputException;

@ControllerAdvice
public class DataEntryControllerAdvice {

    @ExceptionHandler(value = javax.validation.ConstraintViolationException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponseDto> validationsMsgHandler(ConstraintViolationException ex) {

        ErrorResponseDto dto = new ErrorResponseDto();
        List<FieldValidationErrorDto> fieldValidationError = new ArrayList<>();
        dto.setFieldValidationError(fieldValidationError);
        ex.getConstraintViolations().stream().forEach(violation -> {
            FieldValidationErrorDto error = new FieldValidationErrorDto(violation.getMessage(),
                    violation.getPropertyPath().toString());
            fieldValidationError.add(error);

        });
        dto.setCode("VALIDATION_FAILED");
        ResponseEntity<ErrorResponseDto> response = ResponseEntity.badRequest().body(dto);
        return response;
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponseDto> handleInvalidInputExp(InvalidInputException ex) {
        ErrorResponseDto dto = new ErrorResponseDto(ex);
        ResponseEntity<ErrorResponseDto> response = ResponseEntity.badRequest().body(dto);
        return response;
    }
}
