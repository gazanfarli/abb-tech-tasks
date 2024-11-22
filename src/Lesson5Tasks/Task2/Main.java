package Lesson5Tasks.Task2;

public class Main {
    public static void main(String[] args) {
        CoffeeOrder order = new CoffeeOrder(CoffeeType.LATTE, CoffeeSize.LARGE);

        order.printOrderDetails();
        System.out.printf("\nTotal: %.1f$", order.calculateTotal());
    }
}
