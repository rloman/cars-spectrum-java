package nl.spectrum.garage.domain;

public class Car {

    private String licensePlate;
    private double mileage;
    private double price;

    public Car() {

    }

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void drive() {
        this.mileage++;
    }

    public void drive(double mileage){

        this.mileage += mileage;

    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
