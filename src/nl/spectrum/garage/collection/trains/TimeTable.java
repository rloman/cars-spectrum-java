package nl.spectrum.garage.collection.trains;

import nl.spectrum.garage.collection.map.Jas;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TimeTable {


    public static void main(String[] args) {

        NavigableSet<String> timetable = new TreeSet<>();

        timetable.add("13:30");
        timetable.add("15:30");
        timetable.add("11:00");
        timetable.add("10:30");


        String nextTrain = timetable.higher("12:28");

        System.out.println(nextTrain);

        String previousTrain = timetable.lower("12:28");

        System.out.println(previousTrain);

        NavigableSet<Jas> jasjes = new TreeSet<Jas>();

        jasjes.add(new Jas("Raymie"));
    }
}
