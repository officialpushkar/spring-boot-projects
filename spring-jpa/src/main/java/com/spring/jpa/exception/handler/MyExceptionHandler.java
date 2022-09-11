package com.spring.jpa.exception.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = NullPointerException.class)
    public String nullPointer() {
        return "Hey This Null Pointer Exception";
    }

}
