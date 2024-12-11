//package com.cloudthat.eventservice.exception;
//
//public class RestResponseEntityExceptionHandler {
//}
package com.cloudthat.eventservice.exception;

import com.cloudthat.eventservice.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleProductServiceException(CustomException customException){
//        return new ResponseEntity<>(
//                new ErrorResponse().builder()
//                        .message(customException.getMessage())
//                        .code(customException.getStatus())
//                        .build(), HttpStatus.NOT_FOUND);
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(customException.getMessage());
        errorResponse.setCode(customException.getStatus());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);

}

}