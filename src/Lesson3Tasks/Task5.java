package Lesson3Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Divide by: ");
        int divideBy = scanner.nextInt();

        int partLength = str.length() / divideBy;
        int remainingChars = str.length() % divideBy;

        int index = 0;

        System.out.println("The string divided into " + divideBy + " parts and they are:");

        for (int i = 0; i < divideBy; i++) {
            int currentPartLength = partLength + (i < remainingChars ? 1 : 0);
            System.out.println(str.substring(index, index + currentPartLength));

            index += currentPartLength;
        }
    }
}
