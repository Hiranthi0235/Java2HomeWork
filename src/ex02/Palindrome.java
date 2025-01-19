package ex02;
import java.util.Scanner;

public class Palindrome {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String continueInput;

            do {
                System.out.print("Enter a text to check if it's a palindrome: ");
                String input = scanner.nextLine();


                String reversedInput = new StringBuilder(input).reverse().toString();
                if (input.equals(reversedInput)) {
                    System.out.println("The input is a palindrome.");


                } else {
                    System.out.println("The input is NOT a palindrome.");


                }
                System.out.print("Do you want to check another text? (yes/no): ");
                continueInput = scanner.nextLine();
            } while (continueInput.equalsIgnoreCase("yes"));

            System.out.println("Program ended.");
        }
    }




