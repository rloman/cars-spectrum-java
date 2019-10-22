package nl.spectrum.garage.collection;

import java.util.*;

public class App {


    public static void main(String[] args) {


        List<Integer> getallen = new ArrayList<>();

        // een Lijst (ArrayList, LinkedList)

        // hebben de eigenschap dat ze: geordend zijn
        // dat betekent: de laatste die ik toevoeg staat achterin

        // dat wil NIET zeggen DAT ZE gesorteerd zijn!

        getallen.addAll(Arrays.asList(0, 1, 1, 45, 32, 2, 4, 19));

        System.out.println(getallen);

        Collections.sort(getallen);

        System.out.println(getallen);
        System.out.println(getallen);
        System.out.println(getallen);

        // nu extra

        Set<Integer> numbers = new HashSet<>();

        numbers.addAll(Arrays.asList(0, 1, 1, 45, 32, 288, 4, 19));

        System.out.println(numbers);

        // kenmerken set:
        // 1. Geen duplicaten
        // 2. Geen volgordelijkheid

        Collections.sort(numbers);

    }
}
