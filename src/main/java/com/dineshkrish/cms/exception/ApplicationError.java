package com.dineshkrish.cms.exception;

public class ApplicationError {
    private int code;
    private String message;
    private String details;

    public int getCode() {
        return code;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
