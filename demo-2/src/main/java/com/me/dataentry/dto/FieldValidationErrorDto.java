package com.me.dataentry.dto;

public class FieldValidationErrorDto {

    public FieldValidationErrorDto(String message, String field) {
        super();
        this.message = message;
        this.field = field;
    }

    private String message;
    private String field;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
