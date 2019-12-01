package com.tk.trafficlight.service.exceptions;

public class InvalidEmployeeException extends RuntimeException {

    public InvalidEmployeeException() {
        super();
    }

    public InvalidEmployeeException(String message) {
        super(message);
    }

    public InvalidEmployeeException(String message, Exception exception) {
        super(message, exception);
    }

}
