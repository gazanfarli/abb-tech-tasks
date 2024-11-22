package Lesson2Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        for(int i = 0; i < userInput; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        // alternative solution
//        for(int i = 0; i < userInput / 2; i++) {
//            System.out.println(i * 2);
//        }
    }
}

