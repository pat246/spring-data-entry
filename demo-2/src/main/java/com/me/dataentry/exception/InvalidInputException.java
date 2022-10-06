package com.me.dataentry.exception;

public class InvalidInputException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    String code;
    String message;
    String field;

    public InvalidInputException(String code, String message, String field) {
        super();
        this.code = code;
        this.message = message;
        this.field = field;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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
