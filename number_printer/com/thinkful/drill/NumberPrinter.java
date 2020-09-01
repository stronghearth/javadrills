package com.thinkful.drill;
import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a five digit number (ie 12345): ");
        Integer number = scanner.nextInt();
        Integer numberCopy = number;

        if(number.toString().length() != 5) {
            System.out.println("Exception: please enter a five digit number!");
        } else {
            while(numberCopy > 0) {
                int rem = numberCopy % 10;
                numberCopy = numberCopy / 10;
                System.out.println(rem);
            }
        }

    }
}