import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int secretNumber = randomGenerator.nextInt(100) + 1;
        int userGuess;

        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = inputScanner.nextInt();

            if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        } while (userGuess != secretNumber);

        Scanner.close();
    }
}
