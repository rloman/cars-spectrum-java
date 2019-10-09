package nl.spectrum.garage.domain;

import nl.spectrum.garage.inheritance.Vehicle;

public class Car extends Vehicle /* extends Object */ {

    private String licensePlate;
    private double mileage;


    public Car() {

    }

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public void drive() {
        System.out.println("Driving Car");
        this.mileage++;
    }

    @Override
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


}
