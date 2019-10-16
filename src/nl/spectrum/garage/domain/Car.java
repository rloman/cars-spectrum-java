package nl.spectrum.garage.domain;

import nl.spectrum.garage.inheritance.Vehicle;

public class Car extends Vehicle /* extends Object */ {

    private String licensePlate;
    private double mileage;

    public static int CARSINHOLLAND = 8_000_000;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return licensePlate.equals(car.licensePlate);
    }

    /* altijd implementeren samen met equals, maar nu niet, vanwege het OCP karakter van hashCode
    @Override
    public int hashCode() {
        return licensePlate.hashCode();

    }
    */

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
