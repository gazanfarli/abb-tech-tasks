package Lesson5Tasks.Task2;

public enum CoffeeSize {
    SMALL(2.5), MEDIUM(3.5), LARGE(4.5);

    private double price;

    CoffeeSize(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}
