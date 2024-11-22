package Lesson2Tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        String result;
        switch (userInput) {
            case 1:
                result = "Yanvar";
                break;
            case 2:
                result = "Fevral";
                break;
            case 3:
                result = "Mart";
                break;
            case 4:
                result = "Aprel";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "İyun";
                break;
            case 7:
                result = "İyul";
                break;
            case 8:
                result = "Avqust";
                break;
            case 9:
                result = "Sentyabr";
                break;
            case 10:
                result = "Oktyabr";
                break;
            case 11:
                result = "Noyabr";
                break;
            case 12:
                result = "Dekabr";
                break;
            default:
                result = "Invalid input";
        }

        System.out.println(result);
    }
}

