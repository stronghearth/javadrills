package com.thinkful.drill;
import java.util.scanner;

public class SalaryCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.println("Please provide your hourly rate (ie $40.00): ");
        
        double rate = scanner.next();
    
        
    
        System.out.println("Please provide the number of hours worked (ie 20)");
        // read the age
        int hours = scanner.nextInt();

        int total = rate * hours;
        //print the age
        System.out.printf("The total pay is ", total);
    }
}