package nl.spectrum.garage.inheritance;

public abstract class Vehicle {

    private double price;

    public abstract void drive();

    public abstract void drive(double mileage);

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
