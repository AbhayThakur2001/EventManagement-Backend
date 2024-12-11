//package com.cloudthat.eventservice.exception;
//
//public class CustomException {
//}
package com.cloudthat.eventservice.exception;

import lombok.Data;

@Data
public class CustomException extends RuntimeException {
    private int errorCode;
    private int status;

    public CustomException(String message, int errorCode, int status) {
        super(message);
        this.errorCode = errorCode;
        this.status = status;
    }

    public CustomException(String message, int status) {
        super(message);
        this.status = status;
    }
}