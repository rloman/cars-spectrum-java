package nl.spectrum.garage.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class Box <E> {

    private List<E> content = new ArrayList<>();

    public void add(E e) {
        this.content.add(e);
    }




}
