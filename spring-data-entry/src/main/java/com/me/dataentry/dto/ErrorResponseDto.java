package com.me.dataentry.dto;

import java.util.ArrayList;
import java.util.List;

import com.me.dataentry.exception.InvalidInputException;

public class ErrorResponseDto {

    String code;
    List<FieldValidationErrorDto> fieldValidationError;

    public ErrorResponseDto(InvalidInputException ex) {
        code = ex.getCode();
        this.fieldValidationError = new ArrayList<>();
        this.fieldValidationError.add(new FieldValidationErrorDto(ex.getMessage(), ex.getField()));
    }

    public ErrorResponseDto() {
        // TODO Auto-generated constructor stub
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<FieldValidationErrorDto> getFieldValidationError() {
        return fieldValidationError;
    }

    public void setFieldValidationError(List<FieldValidationErrorDto> fieldValidationError) {
        this.fieldValidationError = fieldValidationError;
    }

}
