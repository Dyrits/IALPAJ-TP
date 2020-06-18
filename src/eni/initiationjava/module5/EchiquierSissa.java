package eni.initiationjava.module5;

import java.util.Arrays;

/**
 * Permet d'afficher le nombre de grain de riz sur l'échiquier de Sissa.
 * @author Dyrits
 */

public class EchiquierSissa {
    public static void main(String[] args) {
        // Le nombre total de grain de riz peut être calculé par une simple opération mathématique:
        double totalRice = Math.pow(2, 64) - 1;
        displayDetails();
        System.out.println("Nombre total de grain de riz : " + totalRice);
    }

    public static void displayDetails() {
        // La création et manipulation d'un tableau est facultative, tout comme son affichage.
        double[][] board = new double[8][8];
        double rice = 1;
        // Boucle sur les lignes:
        for (int row = 0; row < 8; row ++) {
            System.out.printf("Ligne %s :%n", + row + 1);
            // Boucle sur les colonnes:
            for (int column = 0; column < 8; column ++) {
                board[row][column] = rice;
                System.out.printf("Colonne %s : %s grains de riz %n", column + 1, rice);
                rice *= 2;
            }
            System.out.println(); // Saut de ligne.
        }
        System.out.println(Arrays.deepToString(board)); // Permet l'affichage directement sous forme de tableau.
        System.out.println(); // Saut de ligne.
    }

}
