package Lesson5Tasks.Task2;

public class CoffeeOrder {
    private CoffeeType type;
    private CoffeeSize size;

    public CoffeeOrder(CoffeeType type, CoffeeSize size) {
        this.type = type;
        this.size = size;
    }

    void printOrderDetails() {
        System.out.println("Order details: ");
        System.out.printf("type: %s\nsize: %s\ndescription: %s", type, size, type.getDescription());
    }

    double calculateTotal() {
        return size.getPrice();
    }
}
