package org.example.app.exceptions;

public class TemperatureOutOfRangeException extends Exception {
    public TemperatureOutOfRangeException(String message) {
        super(message);
    }
}