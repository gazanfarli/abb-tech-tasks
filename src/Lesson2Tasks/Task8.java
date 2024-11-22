package Lesson2Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter operation: ");
        String operation = scanner.next();

        System.out.println();

        switch (operation) {
            case "+":
                System.out.printf("%d %s %d = %d%n", a, operation, b, a + b);
                break;
            case "-":
                System.out.printf("%d %s %d = %d%n", a, operation, b, a - b);
                break;
            case "*":
                System.out.printf("%d %s %d = %d%n", a, operation, b, a * b);
                break;
            case "/":
                System.out.printf("%d %s %d = %d%n", a, operation, b, a / b);
                break;
            case "%":
                System.out.printf("%d %s %d = %d%n", a, operation, b, a % b);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
