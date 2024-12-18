package Lesson9.lesson12;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ScoreInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = -1;

        while (true) {
            try {
                System.out.print("Enter a score (0-100): ");
                score = scanner.nextInt();

                // Checking if the score is in the valid range
                if (score < 0 || score > 100) {
                    throw new UnsupportedOperationException("Score must be in the range of 0 to 100.");
                }

                System.out.println("Valid score entered: " + score);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! You must Enter an integer value.");
                scanner.next();
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
