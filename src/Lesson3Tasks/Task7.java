package Lesson3Tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        System.out.printf("Result: %d", sum);
    }
}
