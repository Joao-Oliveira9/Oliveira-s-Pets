package com.example.demo.presenters.response;

import org.springframework.http.HttpStatus;

public class RestMessage {
    HttpStatus status = HttpStatus.OK;
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
