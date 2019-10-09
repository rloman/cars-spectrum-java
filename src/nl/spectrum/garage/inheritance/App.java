package nl.spectrum.garage.inheritance;

import nl.spectrum.garage.domain.Car;
import nl.spectrum.garage.domain.Truck;

public class App {

    public static void main(String[] args) {

        Truck t = new Truck();

        t.setLicensePlate("BV-99-77");

        System.out.println(t.getLicensePlate());

        t.drive();


        Car andereTruck = new Truck();

        // REGEL
        /*
        Tijdens compile-tijd heb ik een Car als declaratie
        Tijdens runtime heb ik een Truck als instantie
        En wordt dus de Truck::drive() uitgevoerd.
         */

        andereTruck.drive();

        // Dus ... hier is andereTruck een ...
        // Object
        // Car
        // Truck
        // tijdens runtime

        Vehicle[] vehicles = new Vehicle[]{new Car(), t, andereTruck, new Car()};

        System.out.println("Voor de start van de Carivermachinedfdf");

        CarDriverMachine.drive(vehicles);

        Vehicle v = new Truck();

        Vehicle s1 = new Step();
        System.out.println(s1.getPrice());



    }
}
