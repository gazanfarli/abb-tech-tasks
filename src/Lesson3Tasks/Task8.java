package Lesson3Tasks;

import java.util.Arrays;
import java.util.Comparator;

public class Task8 {
    public static void main(String[] args) {
        String[] colors = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};

        System.out.println("Unsorted colors: " + Arrays.toString(colors));

        Arrays.sort(colors, Comparator.comparingInt(String::length));
        System.out.println("\nSorted color (ascending order): " + Arrays.toString(colors));

        Arrays.sort(colors, Comparator.comparingInt(String::length).reversed());
        System.out.println("\nSorted colors - descending: " + Arrays.toString(colors));
    }
}
