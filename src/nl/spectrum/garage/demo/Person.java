package nl.spectrum.garage.demo;

import static nl.spectrum.garage.domain.Car.*;
import nl.spectrum.garage.domain.Philips;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;


public class Person {

    public static void main(String[] args) {
        List l;

        String veter;

        Exception e;


        Philips p;

        l = new ArrayList();


        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.PI * Math.E);

        // door import static hierboven kan ik nu PI en E zonder 'Math.' ervoor bereiken.
        System.out.println(PI);
        System.out.println(E);
        System.out.println(PI * E);

        System.out.println(CARSINHOLLAND);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);




    }
}
