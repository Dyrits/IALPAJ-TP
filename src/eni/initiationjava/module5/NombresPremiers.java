package eni.initiationjava.module5;

import java.util.Scanner;

/**
 * Permet d'afficher les nombres premiers de 0 à une valeur définie.
 * @author Dyrits
 */

public class NombresPremiers {

    public static void main(String[] args) {
        Scanner askInput = new Scanner(System.in);
        System.out.println("Jusqu'à quelle valeur voulez-vous afficher les nombres premiers ?");
        int limit = askInput.nextInt();
        displayPrimesUpTo(limit);
    }

    public static boolean isPrime(int number) {
        if (number == 2) { return true; }
        else if (number < 2) { return false; }
        for (int testNumber = 2; testNumber * testNumber < number; testNumber++) {
            if (number % testNumber == 0) { return false; }
        }
        return true;
    }

    public static void displayPrimesUpTo(int end) {
        for(int start = 0; start < end + 1; start ++) {
            if(isPrime(start)) { System.out.println(start); }
        }
    }
}
