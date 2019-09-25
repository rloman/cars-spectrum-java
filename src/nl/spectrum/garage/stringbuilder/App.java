package nl.spectrum.garage.stringbuilder;

public class App {

    public static void main(String[] args) {
        {
            String name = "Michiel";

            // superstom
            for(int i = 0;i<15;i++) {
                name += i;
            }

            System.out.println(name);
        }


        // good
        {
            StringBuilder stringBuilder = new StringBuilder("Michiel");
            for(int i = 0;i<15;i++) {
                stringBuilder.append(i);
            }

            String name = stringBuilder.toString();

            System.out.println(name);
        }


    }

}
