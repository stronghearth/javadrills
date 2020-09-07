package com.thinkful.drill;
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the word or sentence to check: ");

        String phraseToCheck = scanner.next();

        final String vowels ="aeiouAEIOU";

        int vowelCount = 0;

        for (int i=0; i < phraseToCheck.length(); i++){
            if(vowels.indexOf(phraseToCheck.charAt(i)) != -1) vowelCount++;
        }

        System.out.printf("Your word or phrase has %d vowels!", vowelCount);
    }
}