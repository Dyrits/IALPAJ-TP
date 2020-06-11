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
        // La complexité de la boucle est réduite.
        // Uniquement les valeurs jusqu'à la racine carrée du nombre (+1) sont testées.
        for (int testNumber = 2; testNumber * testNumber < number + 1; testNumber++) {
            if (number % testNumber == 0) { return false; }
        }
        return true;
    }

    public static void displayPrimesUpTo(int end) {
        if (end > 1) { System.out.println(2); }
        // La boucle n'incluant pas 2 (qui est le seul nombre premier pair), celui-ci a été traité au préalable.
        for(int start = 3; start < end + 1; start += 2) {
            if(isPrime(start)) { System.out.println(start); }
        }
    }
}
