package com.thinkful.drill;
import java.util.Scanner;

public class CrowFlies {
    private static double a(double firstX, double secondX, double deltaY) {
        return Math.pow(Math.sin((secondX - firstX) / 2), 2) + Math.cos(firstX) * Math.cos(secondX) * Math
            .pow(Math.sin(deltaY / 2), 2);
      }
    
      private static double c(double a) {
        return 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
      }
    
      private static double d(double c) {
        return 6371 * c;
      }
    
      //Core distance calculation method.
    
      private static double distance(double firstX, double secondX, double firstY, double secondY) {
        double deltaY = Math.toRadians(secondY - firstY);
        return d(c(a(Math.toRadians(firstX), Math.toRadians(secondX), deltaY)));
        }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first x coordinate in degrees: ");
        double firstX = scanner.nextDouble();

        System.out.println("Please enter the first y coordinate in degrees: ");
        double firstY = scanner.nextDouble();

        System.out.println("Please enter the second x coordinate in degrees: ");
        double secondX = scanner.nextDouble();

        System.out.println("Please etner the second y coordinate in degrees: ");
        double secondY = scanner.nextDouble();

        System.out.printf("The calculated distance is %f km", distance(firstX, firstY, secondX, secondY));
    }
}