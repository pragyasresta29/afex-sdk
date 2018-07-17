package com.lftechnology.afex.sdk.exception;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public class ApiException extends RuntimeException {

    public ApiException() {
        super("Something went wrong.");
    }

    public ApiException(String message) {
        super(message);
    }
}
