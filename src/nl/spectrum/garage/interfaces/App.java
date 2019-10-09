package nl.spectrum.garage.interfaces;

import nl.spectrum.garage.domain.Philips;
import nl.spectrum.garage.domain.Televisie;

public class App {

    public static void main(String[] args) {
        Televisie tv = new Philips();

        tv.on();
        tv.switchChannel(55);
        tv.off();
    }
}
