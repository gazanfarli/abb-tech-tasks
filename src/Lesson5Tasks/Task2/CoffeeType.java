package Lesson5Tasks.Task2;

public enum CoffeeType {
    ESPRESSO("A strong coffee shot."),
    LATTE("A smooth coffee with milk."),
    CAPPUCCINO("A rich and foamy coffee.");

    private final String description;

    CoffeeType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
