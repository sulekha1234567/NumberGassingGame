import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalRounds = 0;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; 
            int attemptsLeft = 7; 
            boolean guessedCorrectly = false;

            System.out.println("\n I have picked a number between 1 and 100. You have " + attemptsLeft + " attempts to guess it.");

            while (attemptsLeft > 0) {
                System.out.println("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You guessed the number!");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + numberToGuess);
            }

            totalRounds++;

            System.out.print("\n Do you want to play another round? (yes/no): ");
            String response = scanner5.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\n Game Over!");
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Rounds won: " + roundsWon);

        scanner.close();
    }
}
