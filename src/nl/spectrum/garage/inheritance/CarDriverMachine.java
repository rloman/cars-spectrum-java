package nl.spectrum.garage.inheritance;

public final class CarDriverMachine {

    public static void drive(Vehicle[] vehicles) {

        for(Vehicle c : vehicles) {
            c.drive();
        }

    }
}
