package com.qa.main;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("HOT HOT");
        //WARNING: Error output
        TemperatureConverter temp = new TemperatureConverter();
        System.out.println(temp.convertCelsiusToFahrenheit(30)); //86
        System.out.println(temp.convertCelsiusToKelvin(30)); //303.15
        System.out.println(temp.convertFahrenheitToCelsius(30)); //-1.1
        System.out.println(temp.convertFahrenheitToKelvin(30)); //272.09
        System.out.println(temp.convertKelvinToCelsius(30)); //-274.45
        System.out.println(temp.convertKelvinToFahrenheit(30)); //-405.67
    }
}
