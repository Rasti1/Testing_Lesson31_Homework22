package org.example.app.services;

import org.example.app.exceptions.TemperatureOutOfRangeException;
import org.example.app.utils.TemperatureValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParamTemperatureTest {

    @Test
    @DisplayName("Validating temperature within the range")
    void validateTemperature_withinRange() throws TemperatureOutOfRangeException {
        int temperature = 20;
        TemperatureValidator.validateTemperature(temperature); // Should not throw an exception
    }

    @Test
    @DisplayName("Validating temperature below lower bound")
    void validateTemperature_belowLowerBound() {
        int temperature = -15;
        assertThrows(TemperatureOutOfRangeException.class, () ->
                TemperatureValidator.validateTemperature(temperature));
    }

    @Test
    @DisplayName("Validating temperature above upper bound")
    void validateTemperature_aboveUpperBound() {
        int temperature = 40;
        assertThrows(TemperatureOutOfRangeException.class, () ->
                TemperatureValidator.validateTemperature(temperature));
    }
}
