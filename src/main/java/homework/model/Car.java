package homework.model;

import java.time.Year;
import java.util.UUID;

public class Car {

    private String id;
    private String brand;
    private int yearOfManufactured;
    private double price;

    public Car(String brand, int yearOfManufactured, double price) {
        this.id = UUID.randomUUID().toString();
        this.brand = brand;
        this.yearOfManufactured = yearOfManufactured;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfManufactured() {
        return yearOfManufactured;
    }

    public void setYearOfManufactured(int yearOfManufactured) {
        this.yearOfManufactured = yearOfManufactured;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", yearOfManufactured=" + yearOfManufactured +
                ", price=" + price +
                '}';
    }
}
