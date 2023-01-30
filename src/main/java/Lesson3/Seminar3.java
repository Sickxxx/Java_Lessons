package Lesson3;

import java.util.*;

public class Seminar3 {
    private static Random random;

    public static void main(String[] args) {
        List<String> planets = List.of("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун");
        System.out.println(planets);
        int arrSize = 20;
        ArrayList<String> planetsList = new ArrayList<>();

        for (int i = 0; i < arrSize + 1; i++) {
            random = new Random();
            planetsList.add(planets.get(random.nextInt(planets.size())));
        }
        System.out.println(planetsList);
        int counter;

        Collections.sort(planetsList);
//        planetsList.sort(Comparator.naturalOrder());
        planetsList.sort(Comparator.naturalOrder());
        planetsList.sort(String::compareTo);


        for (String planet : planets) {
            counter = Collections.frequency(planetsList, planet);
            System.out.println(planet + counter);
        }

        Set<String> newSet = new HashSet<>(planetsList);
        System.out.println(newSet);
    }

    private static void ex2() {

        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun",
                "Pluto");

        List<String> planets = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            planets.add(names.get(random.nextInt(8)));
        }
        System.out.println("Original list: " + planets);

        for (int i = 0; i < names.size(); i++) {
            int count = 0;
            for (int j = 0; j < planets.size(); j++) {
                if (names.get(i).equals(planets.get(j))){
                    count++;
                }
            }
            System.out.println(names.get(i) + " = " + count );
        }
    }

    private static void ex3() {
        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun");

        List<String> planets = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            planets.add(names.get(random.nextInt(8)));
        }
        System.out.println("Original list: " + planets);

        for (int i = 0; i < 8; i++) {
            int count = 0;

            for (int j = 0; j < planets.size(); j++) {
                if (names.get(i).equals(planets.get(j)) && count < 1){
                    count++;
                    continue;
                }
                if (names.get(i).equals(planets.get(j)) && count == 1){
                    planets.remove(j);
                    j--;
                }
            }
            System.out.println(planets);

        }
        //System.out.println(planets);
    }
    private static void ex0() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});


        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
    }


}