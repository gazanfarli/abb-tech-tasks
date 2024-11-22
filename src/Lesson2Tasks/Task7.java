package Lesson2Tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a tərəfini daxil edin: ");
        int sideA = scanner.nextInt();
        System.out.println("b tərəfini daxil edin: ");
        int sideB = scanner.nextInt();
        System.out.println("c tərəfini daxil edin: ");
        int sideC = scanner.nextInt();

        if(
                sideA >= sideB + sideC ||
                        sideB >= sideA + sideC ||
                        sideC >= sideA + sideB
        ) {
            System.out.println("Invalid triangle");
        } else {
            System.out.println("Valid triangle");
        }
    }
}

