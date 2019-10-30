package nl.spectrum.garage.recursion.reclist;

public class App {

    public static void main(String[] args) {
        RecList numbers = new RecList();

        numbers.add(4,7,2, 1,2,3,4,5,6,7,8,9);

        numbers.print();

        System.out.println(numbers.size());

        System.out.println(numbers.contains(7));
        System.out.println(numbers.contains(38) == false);

        System.out.println(numbers.indexOf(3) == 5);
    }

}
