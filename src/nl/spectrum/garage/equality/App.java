package nl.spectrum.garage.equality;

import nl.spectrum.garage.domain.Car;

public class App {

    public static void main(String[] args) {

        // nu zijn a en b gelijk
        {
            Car a = new Car();

            Car b = a;

            System.out.println(a == b);
        }

        //  nu zijn a en b niet gelijk
        {
            Car a = new Car("A");
            Car b = new Car("B");

            System.out.println(a == b);

            System.out.println(a.equals(b));
        }

        //  nu zijn a en b NU wel gelijk
        {
            Car a = new Car("A");
            Car b = new Car("A");

            System.out.println(a == b);

            System.out.println(a.equals(b)); // semantische gelijkheid
        }



    }
}
