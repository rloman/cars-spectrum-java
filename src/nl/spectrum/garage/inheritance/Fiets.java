package nl.spectrum.garage.inheritance;

public class Fiets extends Vehicle {


    @Override
    public void drive() {
        System.out.println("Driving Fiets ... ");

    }

    @Override
    public void drive(double mileage) {

        System.out.println("Driving Fiets (double) ");

    }
}
