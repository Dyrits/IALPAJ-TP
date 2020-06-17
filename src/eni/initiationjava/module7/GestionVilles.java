package eni.initiationjava.module7;

import java.util.Arrays;

public class GestionVilles {

    static public String[] cities = {
            "Lille",
            "Lens",
            "Amiens",
            "Rouen",
            "Caen",
            "Rennes",
            "Nantes",
            "Niort",
            "Bordeaux",
            "Bayonne"
    };

    public static void main(String[] args) {
        displayCities(); // Display the array.
        displayCitiesStartingWith("A"); // Display the element of the array starting with "A".
        addRandomNumberToCities(); // Add a random integer after each element.
        displayCities(); // Display the array.
    }

    public static void displayCities() {
        System.out.println(Arrays.toString(cities));
    }

    public static void displayCitiesStartingWith(String start) {
        for (String city: cities) {
            if (city.startsWith(start)) {
                System.out.println(city);
            }
        }
    }

    public static void addRandomNumberToCities() {
        for (int index = 0; index < cities.length; index ++) {
            cities[index] = cities[index] + ((int) (Math.random() * Integer.MAX_VALUE));
        }
    }
}
