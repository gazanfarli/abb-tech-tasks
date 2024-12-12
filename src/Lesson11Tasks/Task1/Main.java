package Lesson11Tasks.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isInputValid = false;

        while (!isInputValid) {
            try {
                System.out.println("Enter a number: ");
                int value = scanner.nextInt();

                isInputValid = true;
                System.out.println(Math.pow(value, 2));
            } catch (InputMismatchException e) {
                System.out.println("Invalid integer value");
                scanner.nextLine();
            }
        }
    }
}
