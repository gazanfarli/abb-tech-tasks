package Lesson3Tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        StringBuilder reversedStr = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            reversedStr.append(str.charAt(i));
        }

        System.out.printf("Result: %s", reversedStr);
    }
}
