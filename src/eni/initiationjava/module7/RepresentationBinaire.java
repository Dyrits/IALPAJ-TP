package eni.initiationjava.module7;

import java.util.Scanner;

/**
 * Permet d'établir la représentation binaire pour tout entier inférieur à 2147483648.
 * @author Dyrits
 */

public class RepresentationBinaire {
    public static void main(String[] args) {
        Scanner askInput = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier: ");
        int number = askInput.nextInt();
        System.out.println("Représentation binaire : " + representationBinaire(number));
    }

    public static String representationBinaire(int number) {
        StringBuilder representationBinaire = new StringBuilder();
        for(int exponential = 1073741824; exponential  > 0; exponential  /= 2) {
            representationBinaire.append(number / exponential  == 0 ? 0 : 1);
            number %= exponential ;
        }
        return representationBinaire.toString();
    }
}
