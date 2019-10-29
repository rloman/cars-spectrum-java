package nl.spectrum.reclist;

public class App {

    public static void main(String[] args) {
        RecList numbers = new RecList();
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);

        numbers.print();

        numbers.add(1,2,3,4,5,6,7,8,9);

        numbers.print();

        System.out.println(numbers.size());

        System.out.println(numbers.contains(7));
        System.out.println(numbers.contains(38) == false);
    }

}
