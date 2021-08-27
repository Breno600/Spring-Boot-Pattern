package com.estudo.patterns.controller.handler;

import com.estudo.patterns.domain.model.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.security.InvalidParameterException;

@ControllerAdvice
public class HandlerException extends ResponseEntityExceptionHandler {

    private static final HttpStatus NOT_FOUND = HttpStatus.NOT_FOUND;

    @ExceptionHandler(InvalidParameterException.class)
    public @ResponseBody ResponseEntity<ApiException> handleInvalidParameterException(
            InvalidParameterException ex) {
        return ResponseEntity.status(NOT_FOUND)
                .body(createResponseException(ex.getMessage(), NOT_FOUND));
    }

    private ApiException createResponseException(String message, HttpStatus status) {
        return new ApiException(message, status.value());
    }
}
