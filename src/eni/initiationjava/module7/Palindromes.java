package eni.initiationjava.module7;

import java.util.Scanner;

/**
 * Permet de déterminer si une phrase est un palindrome ou non.
 * @author Dyrits
 */

public class Palindromes {
    public static void main(String[] args) {
        Scanner askInput = new Scanner(System.in);
        System.out.print("Veuillez saisir une phrase: ");
        String sentence = askInput.nextLine();
        System.out.println(new StringBuilder(sentence)
                .reverse()
                .toString()
                .replaceAll("[^A-Za-z]", "")
                .toLowerCase()
                .equals(sentence
                        .replaceAll("[^A-Za-z]", "")
                        .toLowerCase()) ?
                "C'est un palindrome!" : "Ce n'est pas un palindrome...");
    }
}