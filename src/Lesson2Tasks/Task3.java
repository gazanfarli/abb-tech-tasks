package Lesson2Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        int sum = 0;

        while (userInput > 0) {
            int residue = userInput % 10;
            userInput /= 10;

            sum += residue;
        }

        System.out.println("Sum: " + sum);
    }
}
