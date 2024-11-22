package Lesson3Tasks;

public class Task9 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 5, 9, 2, 8, 6, 4};

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
            if(numbers[i] < minNumber){
                minNumber = numbers[i];
            }
        }

        System.out.printf("Max num: %d \nMin num: %d", maxNumber, minNumber);
    }
}
