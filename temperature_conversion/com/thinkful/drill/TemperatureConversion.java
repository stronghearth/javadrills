package com.thinkful.drill;
import java.util.Scanner;

/**
    * Prompts the user for a value and reads the value
    * from the command line.
    * 
    * More information about the Scanner may be found
    * here: https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
    */
public class TemperatureConversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please provide the temperature in Celsius: ");

        double temp = scanner.nextDouble();

        double converted = (temp * 9/5) + 32;

        System.out.printf("The temperature in Fahrenheit is: %f \n", converted);
    }
}