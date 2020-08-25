package com.thinkful.drill;
import java.util.Scanner;

public class FastTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the distance to your destination: ");
        double distance = scanner.nextDouble();

        System.out.println("Please enter the length of time you have to get there: ");
        double time = scanner.nextDouble();

        System.out.printf("%f", distance/time);
    }
}