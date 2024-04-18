package org.example.app.view;

import java.util.Scanner;

public class AppView {
    public static final Scanner sc = new Scanner (System.in);
    public void getOutput(){
        System.out.println("Hello! Welcome to temperature device.\n"
                + "Caution! Device working only if the value of temperature " +
                "equals from -10 to +35 Celsius degrees.");
    }
    public int getTemperature() {
        System.out.print("\nEnter the current temperature: ");
        return sc.nextInt();
    }

    public void getOutput (String output){
        System.out.println(output);
    }
}
