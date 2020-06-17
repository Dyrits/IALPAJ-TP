package eni.initiationjava.module4;

import java.util.Scanner;

/**
 * Permet d'enregistrer un ensemble de chèques afin d'en obtenir différentes statistiques.
 * @author Dyrits
 */

public class StatistiquesCheques {
    public static void main(String[] args) {
        Scanner askInput = new Scanner(System.in);

        // Variables:
        int numCheque;
        double montantCheque;
        int nombreCheques = 0;
        double montantTotal = 0;
        double moyenne = 0;
        int cheques200Plus = 0;
        double montantCheques200Plus = 0;
        int cheques200Moins = 0;
        double montantCheques200Moins = 0;
        int numChequeMin = 0; // Impossible de déclarer la variable sans l'initialiser.
        double montantChequeMin = 0;
        int numChequeMax = 0; // Impossible de déclarer la variable sans l'initialiser.
        double montantChequeMax = 0;

        do {
            System.out.print("Veuillez saisir le numéro de chèque. Tapez 0 pour quitter : ");
            numCheque = askInput.nextInt();
            if (numCheque == 0) {
                continue; // break; peut être utilisé à la place.
            }
            nombreCheques++;
            System.out.print("Veuillez saisir le montant du chèque: ");
            montantCheque = askInput.nextDouble();
            montantTotal += montantCheque;
            if (montantCheque < 200) {
                cheques200Moins++;
                montantCheques200Moins += montantCheque;
            } else {
                cheques200Plus++;
                montantCheques200Plus += montantCheque;
            }
            // Minimum:
            if (montantChequeMin > montantCheque || nombreCheques == 1) {
                montantChequeMin = montantCheque;
                numChequeMin = numCheque;
            }
            // Maximum:
            if (montantChequeMax < montantCheque || nombreCheques == 1) {
                montantChequeMax = montantCheque;
                numChequeMax = numCheque;
            }

        } while (numCheque != 0);

        askInput.close();

        moyenne = montantTotal / nombreCheques;
        System.out.printf("Vous avez introduit %s chèques.%n", nombreCheques);
        if (nombreCheques > 0) {
            System.out.printf("Le montant total des chèques est de %.2f euros.%n", montantTotal);
            System.out.printf("Le montant moyen des chèques est de %.2f euros.%n", moyenne);
            System.out.printf("Le nombre de chèques avec un montant inférieur à 200 euros est de %s.%n", cheques200Moins);
            System.out.printf("Le montant total de ces chèques est de %.2f euros.%n", montantCheques200Moins);
            System.out.printf("Le nombre de chèques avec un montant supérieur ou égal à 200 euros est de %s.%n", cheques200Plus);
            System.out.printf("Le montant total de ces chèques est de %.2f euros.%n", montantCheques200Plus);
            System.out.printf("Le chèque au montant le plus élevé est de %.2f euros. ", montantChequeMax);
            System.out.printf("Ce chèque porte le numéro %s.%n", numChequeMax);
            System.out.printf("Le chèque au montant le plus bas est de %.2f euros. ", montantChequeMin);
            System.out.printf("Ce chèque porte le numéro %s.%n", numChequeMin);
        }
    }
}
