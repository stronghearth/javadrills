package com.thinkful.drill;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.println("Please provide your hourly rate (ie 40.00): ");
        
        double rate = scanner.nextDouble();
    
        
    
        System.out.println("Please provide the number of hours worked (ie 20): ");
        // read the age
        double hours = scanner.nextDouble();

        
        //print the age
        System.out.printf("The total pay is %f per week", rate * hours);
    }
}