package Lesson3Tasks;

public class Task4 {
    public static void main(String[] args) {
        String input = "w3resource";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        System.out.println("Result: " + result);
    }
}
