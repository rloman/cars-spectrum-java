package nl.spectrum.garage.collection.generics.utils;

public final class Calculator {

    public static <T extends Comparable> T max(T a, T b) {

        return a.compareTo(b) < 0 ? b : a;
    }

    private Calculator() {

    }
}
