package nl.spectrum.garage.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Garderobe {


    public static void main(String[] args) {


        Map<Integer, Jas> garderobe = new HashMap<>();

        // map with integer maps to Jas
        // 42 => Jas van Sjako
        // 43 => Jas van Jeremy
        // 103 => Jas van Michiel

        garderobe.put(42, new Jas("Sjako"));

        garderobe.put(43, new Jas("Jeremy"));


        garderobe.put(103, new Jas("Michiel"));

        // je gaat nu heen zuipen ...

        // drie uur later kom je half bezopen terug :-)

        Jas jasVanJeremy = garderobe.get(43);

        System.out.println(jasVanJeremy.getOwner());
        System.out.println(garderobe.get(42));
        System.out.println(garderobe.get(103));
//        System.out.println(garderobe.get(104).getOwner()); // runtime error, rund

    }
}
