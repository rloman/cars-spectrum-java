package nl.spectrum.garage.loopsWithArray;

public class App {

    public static void main(String[] args) {

//        int[] numbers = new int[3]; // => {0,0,0} met index 0,1,2

//        numbers = new int[]{1,2,3,4,5,6};

        // syntactic sugar

        int[] numbers = {1,2,3};

        for(int n : numbers) {

            System.out.println(n);
        }

        foo(numbers);

        int[] otherNumbers = {1,2,3};

        System.out.println(numbers != otherNumbers);

        System.out.println(numbers.equals(otherNumbers)); // => false, want het zijn verschillende referenties.

    }

    public static void foo(Object o) {

    }
}
