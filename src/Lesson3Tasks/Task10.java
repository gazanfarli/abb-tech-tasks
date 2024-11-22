package Lesson3Tasks;

public class Task10 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 5, 9, 2, 8, 6, 4, 2, 7, 2};

        int occurrences = 0;
        int searchedValue = 2;

        for (int i = 1; i < numbers.length; i++) {
            if(searchedValue == numbers[i]){
                occurrences++;
            }
        }

        System.out.printf("Occurrences of %d: %d", searchedValue, occurrences);
    }
}
