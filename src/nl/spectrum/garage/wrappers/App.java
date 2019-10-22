package nl.spectrum.garage.wrappers;

public class App {

    public static void main(String[] args) {

        // boxing
        foo(3);

        // unboxing
        Object o = bar();

        // Het principe heet: auto-boxing!

        // Onder water gebeurt dit!

        foo(new Integer(5)); // onder water wordt de waarde hierboven ingepakt door middel van new Integer...

        System.out.println(bar().intValue() + 2);  /// onder water uitgepakt door intValue();

        // met 'onder water' bedoel ik hier: de compiler doet dit voor ons!

        boolean b = new Boolean("true");

        Double d = 3.5;


        // Wrapper classes

        /*
        van             naar
        byte            Byte
        short           Short
        int             Integer  //!!
        long            Long

        float           Float
        double          Double

        char            Character //!!

        boolean         Boolean
         */

        String age = "42";

        int a = Integer.parseInt(age);

        System.out.println(a+1);

        String getal42InBinair = Integer.toBinaryString(a);

        System.out.println(getal42InBinair);

        System.out.println(Integer.max(43,3));

        System.out.println(Math.sqrt(2));

        System.out.println(Math.PI);

        System.out.println(Math.random() * 100);




    }

    public static void foo(Object o) {

        System.out.println(o);

    }

    public static Integer bar() {
        return 5;
    }


}
