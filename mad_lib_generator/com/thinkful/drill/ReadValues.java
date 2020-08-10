package com.thinkful.drill;
import java.util.Scanner;
/**
    * Prompts the user for a value and reads the value
    * from the command line.
    * 
    * More information about the Scanner may be found
    * here: https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
    */
public class ReadValues {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.println("Give me a person's name or title: ");
        //read the String value into a variable
        String name = scanner.next();
    
        System.out.println("Please give me an adjective: ");
        
        String adjective1 = scanner.next();

        System.out.println("Please give me a second adjective: ");
        
        String adjective2 = scanner.next();

        System.out.println("Please give me a third adjective: ");
        
        String adjective3 = scanner.next();

        System.out.println("Please give me a fourth adjective: ");
        
        String adjective4 = scanner.next();

        System.out.println("Please give me a fifth adjective: ");
        
        String adjective5 = scanner.next();

        System.out.println("Please give me a workplace type: ");

        String workplaceType = scanner.next();

        System.out.println("Please give me a personal characteristic: ");

        String personalCharacteristic = scanner.next();

        System.out.println("Please give me a personality trait: ");

        String personalityTrait = scanner.next();

        System.out.println("Please give me a verb: ");

        String verb = scanner.next();

        System.out.println("Please give me a third person pronoun (he, she, them): ");

        String pronoun = scanner.next();
        
        System.out.printf(
            "%s is a person of an %s disposition and is %s in the %s for his %s  and the %s  of his %s. "
                + "This circumstance, added to his well-known %s and %s  courage, made me very desirous to %s  %s.",
            name, adjective1, adjective2, workplaceType,
            adjective3, adjective4, personalCharacteristic,
            personalityTrait, adjective5, verb, pronoun);
    }
}