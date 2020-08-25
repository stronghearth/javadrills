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
        System.out.println("Please enter your name: ");
        //read the String value into a variable
        String name = scanner.next();
        //print out the value
        System.out.printf("Hello %s\n", name);
        //Ask for a numeric value
        System.out.println("Please tell us your age:");
        // read the age
        int age = scanner.nextInt();
        //print the age
        System.out.printf("Holy Moly! %d is old!\n", age);
    }
}