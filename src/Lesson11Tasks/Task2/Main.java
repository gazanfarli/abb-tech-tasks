package Lesson11Tasks.Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int minMortgageAge = 20;
        int maxMortgageAge = 45;

        try {
            System.out.println("Enter your age: ");
            value = scanner.nextInt();
            if (value < minMortgageAge || value > maxMortgageAge) {
                throw new InvalidInputException(String.format("Age range for mortgage is: %d -> %d", minMortgageAge, maxMortgageAge));
            }

            System.out.println("Your age is suitable for mortgage");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (Exception exception) {
            System.out.println("Invalid input");
        } finally {
            scanner.nextLine();
        }
    }
}
