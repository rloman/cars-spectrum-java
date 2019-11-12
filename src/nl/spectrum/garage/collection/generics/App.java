package nl.spectrum.garage.collection.generics;

import nl.spectrum.garage.collection.generics.utils.Calculator;
import nl.spectrum.garage.collection.map.Jas;

public class App {

    public static void main(String[] args) {

        NumberBox<Double> vout = new NumberBox<>();

        Jas m = new Jas("Michiel");
        Jas s = new Jas("Sjako");

        Jas grootste = Calculator.max(m, s);

        System.out.println(grootste);


    }
}
