package nl.spectrum.garage.domain;

public class Truck extends Car {


    @Override
    public void drive() {
        System.out.println("Driving Truck");
    }
}
