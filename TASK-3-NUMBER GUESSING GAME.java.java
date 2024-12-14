import java.util.Random;  
import java.util.Scanner;  

public class NumberGuessingGame {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        Random random = new Random();  
        int numberToGuess;  
        int guess;  
        int attempts = 0;  
        boolean playAgain = true;  
        int maxAttempts = 5;  

        System.out.println("Welcome to the Number Guessing Game!");  

        while (playAgain) {  
            attempts = 0;  
            numberToGuess = random.nextInt(100) + 1;  
            System.out.println("I'm thinking of a number between 1 and 100. You have " + maxAttempts + " attempts.");  

            while (attempts < maxAttempts) {  
                System.out.print("Enter your guess: ");  
                while (!scanner.hasNextInt()) {  
                    System.out.println("Invalid input. Please enter a number between 1 and 100.");  
                    scanner.next();  
                }  
                guess = scanner.nextInt();  
                attempts++;  

                if (guess < numberToGuess) {  
                    System.out.println("Too low!");  
                } else if (guess > numberToGuess) {  
                    System.out.println("Too high!");  
                } else {  
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");  
                    break;  
                }  
            }  

            if (attempts == maxAttempts) {  
                System.out.println("You ran out of attempts. The number was " + numberToGuess);  
            }  

            System.out.print("Do you want to play again? (y/n): ");  
            String playAgainInput = scanner.next();  
            playAgain = playAgainInput.equalsIgnoreCase("y");  
        }  

        System.out.println("Thanks for playing!");  
        scanner.close();  
    }  
}