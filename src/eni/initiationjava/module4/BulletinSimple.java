
package eni.initiationjava.module4;

import java.util.Scanner;

public class BulletinSimple {
    public static void main(String[] args) {
        Scanner askInput = new Scanner(System.in);

        System.out.print("Entrez votre nom complet: ");
        String nom = askInput.nextLine();
        System.out.print("Entrez votre status: ");
        String status = askInput.nextLine();
        System.out.print("Entrez le nombre d'heures travaillées: ");
        double heures = askInput.nextDouble();
        System.out.print("Entrez votre rémunération horaire: ");
        double tauxHoraire = askInput.nextDouble();
        System.out.print("Entrez votre nombre d'enfants: ");
        int nombreEnfants = askInput.nextInt();

        double salaireBrut = calculerSalaireBrut(heures, tauxHoraire);
        double cotisations = calculerCotisations(salaireBrut);
        int prime = calculerPrime(nombreEnfants);
        double salaireNet = calculerSalaireNet(salaireBrut, cotisations, prime);

        System.out.println();
        System.out.println("Nom : " + nom);
        System.out.println("Status : " + status);
        System.out.printf("Le montant de votre salaire brut s'élève à %.2f euros.%n", salaireBrut);
        System.out.printf("Le montant de vos cotisations s'élève à %.2f euros.%n", cotisations);
        System.out.printf("Le montant de votre prime familiale s'élève à %s euros.%n", prime);
        System.out.printf("Le montant de votre salaire net s'élève à un total de %.2f euros.%n", salaireNet);
    }

    private static double calculerSalaireBrut(double heures, double tauxHoraire) {
        // Re-calcul des heures en tenant compte de la majoration:
        heures += heures > 180 ? (heures - 180) * 0.6 : 0;
        heures += heures > 169 ? (Math.min(heures, 180) - 169) * 0.5 : 0;
        return heures * tauxHoraire;
    }

    private static double calculerCotisations(double salaireBrut) {
        // Le total des cotisations s'élèvent à 29.81%.
        return salaireBrut * 29.81 / 100;
    }

    private static int calculerPrime(int nombreEnfants) {
        if (nombreEnfants > 0) {
            return nombreEnfants > 2 ? 70 + 20 * (nombreEnfants - 2) : nombreEnfants > 1 ? 50 : 20;
        }
        else { return 0; }
    }

    private static double calculerSalaireNet(double salaireBrut, double cotisations, int prime) {
        return salaireBrut + prime - cotisations;
    }
}

