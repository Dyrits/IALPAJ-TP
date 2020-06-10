package eni.initiationjava.module4;
import java.util.Scanner;

/**
 * Ce programme permet de calculer le temps de cuisson, en secondes, d'une viande selon le type de cuisson choisi.
 * @author Dyrits
 */

public class TempsDeCuisson {

    static final double[] CUISSON_BOEUF = {10 / 500.0 * 60, 17 / 500.0 * 60, 25 / 500.0 * 60};
    static final double[] CUISSON_PORC = {15 / 400.0 * 60, 25 / 400.0 * 60, 40 / 400.0 * 60};

    public static void main(String[] args) {
        Scanner askInput = new Scanner(System.in);
        int viande;
        int cuisson;
        int tempsDeCuisson;
        do {
            System.out.println("Quelle viande souhaitez-vous?");
            System.out.println("1: BOEUF | 2: PORC");
            viande = askInput.nextInt() - 1;
        } while (viande != 0 && viande != 1);

        do {
            System.out.println("Quelle cuisson souhaitez-vous?");
            System.out.println("1: BLEU | 2: A POINT | 3: BIEN CUIT");
            cuisson = askInput.nextInt() - 1;
        } while (cuisson != 0 && cuisson != 1 && cuisson != 2);

        System.out.println("Quel est le poids de la viande, en grammes ?");

        int poids = askInput.nextInt();

        if (viande == 0) {
            tempsDeCuisson = poids * (int) CUISSON_BOEUF[cuisson];
        } else {
            tempsDeCuisson = poids * (int) CUISSON_PORC[cuisson];
        }

        System.out.printf("Le temps de cuisson pour %s grammes est de %s secondes.", poids, tempsDeCuisson);
    }
}
