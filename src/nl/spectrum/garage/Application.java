package nl.spectrum.garage;

import nl.spectrum.garage.domain.Car;

public class Application {

    public static void main(String[] args) {

        Car dafje = new Car();

        System.out.println(dafje.getLicensePlate());

        System.out.println(dafje.getMileage());

        dafje.drive();

        System.out.println(dafje.getMileage());

        dafje.drive();

        System.out.println(dafje.getMileage());

        dafje.drive(11);

        System.out.println(dafje.getMileage());

    }
}
