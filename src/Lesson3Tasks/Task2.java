package Lesson3Tasks;

public class Task2 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";

        String regex = "fox";
        String replacement = "cat";
        String newText = text.replaceAll(regex, replacement);

        System.out.println("Original text: " + text);
        System.out.println("New text: " + newText);
    }
}
