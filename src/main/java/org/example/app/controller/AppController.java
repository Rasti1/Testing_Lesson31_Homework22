package org.example.app.controller;

import org.example.app.exceptions.TemperatureOutOfRangeException;
import org.example.app.utils.TemperatureValidator;
import org.example.app.view.AppView;

public class AppController {

    public void checkTemperature() {

        while(true){

            AppView view = new AppView();
            view.getOutput();

            try {
                int temperature = view.getTemperature();
                TemperatureValidator.validateTemperature(temperature);
                if (temperature <= 10) {
                    view.getOutput("It's cold outside. Dress warmly.\n");
                } else if (temperature <= 17) {
                    view.getOutput("Dress lightly.\n");
                } else {
                    view.getOutput("It's hot outside. Dress appropriately.\n");
                }
            } catch (TemperatureOutOfRangeException e) {
                view.getOutput("\nTemperature Error: " + e.getMessage());
            }
        }
    }
}

