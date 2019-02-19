package com.youzan.open.sdk.exception;

public class KDTException extends RuntimeException {

    public KDTException() {
        super();
    }

    public KDTException(String message) {
        super(message);
    }

    public KDTException(String message, Throwable cause) {
        super(message, cause);
    }

    public KDTException(Throwable cause) {
        super(cause);
    }

}
