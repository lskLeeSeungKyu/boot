package com.boot.boot.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;


/**
 * RestController에서 발생하는 DataAccessException 공통 예외 처리
 */
@RestControllerAdvice
@Slf4j
public class RestControllerDBException {

    @ExceptionHandler(DataAccessException.class)
    @ResponseBody
    public Map<String, String> DataAccessException(DataAccessException e) {
        Map<String, String> map = new HashMap<>();

        String errorMessage = e.getMessage();
        Throwable cause = e.getCause();

        map.put("result", "fail");
        map.put("errorMessage", errorMessage);
        log.info("writeBoard errorLog = {}", errorMessage);

        if(cause != null) {
            String errorCause = cause.getMessage();
            map.put("errorCause", errorCause);
            log.info("writeBoard errorLog = {}", errorCause);
        }

        return map;
    }
}