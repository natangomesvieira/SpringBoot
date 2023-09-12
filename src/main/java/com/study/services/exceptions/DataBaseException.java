package com.study.services.exceptions;

public class DataBaseException extends RuntimeException {
    
    public static final long serialVersionUID = 1L;

    public DataBaseException(String message) {
        super(message);
    }

}
