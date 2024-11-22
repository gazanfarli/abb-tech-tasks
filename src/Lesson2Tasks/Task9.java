package Lesson2Tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int userInput = scanner.nextInt();

        int result = 1;
        while (userInput != 0) {
            result *= userInput;
            userInput--;
        }

        System.out.printf("Result: %d", result);
    }
}
