package Lesson4Tasks.Task3;

public class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private String fuelType;
    private double speed = 0;

    public Car(String brand, String model, int yearOfProduction, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
    }

    void speed(double amountOfSpeed) {
        this.speed += amountOfSpeed;
    }

    void slow(double amountOfSpeed) {
        this.speed -= amountOfSpeed;
    }

    void stop() {
        this.speed = 0;
    }

    String checkSpeed(double limit) {
        return this.speed > limit ? "You are over the speed limit, lower your speed" : "Drive safe";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getSpeed() {
        return speed;
    }
}
