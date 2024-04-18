package org.example.app.utils;

import org.example.app.exceptions.TemperatureOutOfRangeException;

public class TemperatureValidator {

    public static void validateTemperature(int temperature) throws TemperatureOutOfRangeException {
        if (temperature < -10 || temperature > 35) {
            throw new TemperatureOutOfRangeException("the device cannot operate outside " +
                    "the temperature range (-10 to +35).\n");
        }
    }
}

