package LoopsChallenges;
import java.util.Scanner;

public class WhileLoopChallenge {
    public static void numberGuessingGame() {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 42;
        int guess = 0;
        int attempts = 0;
        
        System.out.println("Guess the secret number (1-100):");
        
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts!");
            }
        }
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        numberGuessingGame();
    }
}

  
}
