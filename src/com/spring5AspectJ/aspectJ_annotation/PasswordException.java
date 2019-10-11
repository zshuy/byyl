package com.spring5AspectJ.aspectJ_annotation;

public class PasswordException extends UserException {
    public PasswordException() {
    }

    public PasswordException(String message) {
        super(message);
    }
}
