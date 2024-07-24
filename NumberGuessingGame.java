import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = ThreadLocalRandom.current().nextInt(lowerBound, upperBound + 1);
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a random number between " + lowerBound + " and " + upperBound + ".");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next(); // clear the invalid input
            }
            guess = scanner.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }

        scanner.close();
    }
}
