package com.example.simulator.controller;

//import jakarta.validation.ConstraintViolationException;
//import lombok.extern.slf4j.Slf4j;

import com.example.simulator.Dto.ExceptionResponse;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Slf4j
@ControllerAdvice
public class ExceptionHandlerController {



    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<?> handleAccessException(ConstraintViolationException ex) {
        log.error(ex.getMessage(),ex);
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ExceptionResponse(400, ex.getMessage()));
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleAccessException(Exception ex) {
        log.error(ex.getMessage(),ex);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ExceptionResponse(500, "Unknown error"));

    }
}
