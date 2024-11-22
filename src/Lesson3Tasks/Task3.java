package Lesson3Tasks;

public class Task3 {
    public static void main(String[] args) {
        String str = "successes";

        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int first = 0, second = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[first]) {
                second = first;
                first = i;
            } else if (count[i] > count[second] && count[i] != count[first]) {
                second = i;
            }
        }

        if (second != 0) {
            System.out.println("The second most frequent char in the string is: " + (char) second);
        } else {
            System.out.println("No second most frequent character");
        }
    }
}
