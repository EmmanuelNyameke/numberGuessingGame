import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        // Creating Instances of the imported classes
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generating a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        // Interface for the game: Game intro
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("---------------------------------------------------------------------\n");
        System.out.println("Try to guess the secret number between 1 and 100");
        System.out.println("---------------------------------------------------------------------\n");

        // Create a counter to track attempts at guessing
        int attempts = 0;

        // Create a boolean variable to check if the number is guessed correctly
        boolean found = false;

        // Game Engine using a 'while' loop
        while(!found){
            // Prompt for user input
            System.out.print("Enter your guess: ");
            // Save input into a variable
            int guess = scanner.nextInt();
            // Increase attempt by 1
            attempts++;

            // Check if guessed number matches random number
            if(guess == secretNumber){
                System.out.println("Congratulations! You have guessed the correct number " + secretNumber + " in " + attempts + " attempts.");
                // On number guessed, found becomes true
                found = true;
            } else if(guess > secretNumber){
                System.out.println("Too high, try again");
            }
            else{
                System.out.println("Too low, try again");
            }
            if(attempts == 5){
                System.out.println("--GAME OVER--");
                scanner.close();
                // Close the application
                System.exit(0);
            }
        }
        // Close the scanner
        scanner.close();
    }
}
