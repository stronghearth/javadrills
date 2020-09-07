package com.thinkful.drill;
import java.util.Scanner;

public class OvertimePay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide your hourly rate (ie 40.00): ");

        double rate = scanner.nextDouble();

        System.out.println("Please provide the number of hours worked: ");

        double hours = scanner.nextDouble();

        double overtime = hours - 40;

        if (overtime > 0) {
            double basePay = 40 * rate;

            double overtimeRate = rate * 1.5;

            double payOvertime = overtime * overtimeRate;

            System.out.printf("The total pay is %f per week", basePay + payOvertime);
        } else {
            System.out.printf("The total pay is %f per week", rate * hours);
        }
    }
}