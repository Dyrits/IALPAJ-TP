package eni.initiationjava.module7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Permet de mélanger les lettres des mots d'une phrase, en tenant compte de la ponctuation.
 * @author Dyrits
 */

public class Melangeur {

    private static final Random randomIndex = new Random();

    public static void main(String[] args) {
        Scanner askInput = new Scanner(System.in);
        String sentence = askInput.nextLine();
        String shuffledSentence = shuffleString(sentence);
        System.out.println(shuffledSentence);
    }

    public static String shuffleString(String string) {
        String[] sentenceArray = string.split(" "); // Division de la phrase en un tableau de mots.
        for (int index = 0 ; index < sentenceArray.length ; index++) {
            // Si le mot est plus court que 4 lettres, il ne changera pas. On passe à l'itération suivante:
            if (sentenceArray[index].length() < 4) { continue; }
            // Chaque mot est divisé en un tableau de lettres:
            char[] wordArray = sentenceArray[index].toCharArray();
            sliceAndShuffleWord(wordArray);
            sentenceArray[index] = new String(wordArray); // Le mot est modifié au sein du tableau.
        }
        // Le tableau est converti pour renvoyer une chaîne de caractères:
        return String.join(" ", sentenceArray);
    }

    public static void sliceAndShuffleWord(char[] word) {
        // Les index de débuts et fins pour le mélange sont déterminés en vérifiant les extrémités.
        // Le mot peut, en effet, contenir des caractères spéciaux en début et fin,
        int indexStart = 1;
        int indexEnd = word.length - 1;
        while (!Character.isLetter(word[indexStart])) {
            indexStart ++;
            // On sort de la méthode si, sans les caractères spéciaux, le mot est trop court pour être mélangé.
            if (indexEnd - indexStart < 2) { return; }
        }
        while (!Character.isLetter(word[indexEnd])) {
            indexEnd --;
            // On sort de la méthode si, sans les caractères spéciaux, le mot est trop court pour être mélangé.
            if (indexEnd - indexStart < 2) { return; }
        }
        // Un tableau est créé pour stocker uniquement les lettres qui seront mélangées:
        char[] slicedArray =  Arrays.copyOfRange(word, indexStart, indexEnd);
        shuffleWord(slicedArray);
        // Pour chaque lettre du tableau entre l'index de début et de fin est attribué celle du tableau de lettre mélangé:
        for(int index = 0; index < word.length; index ++) {
            if (index < indexStart) { continue; }
            if (index == indexEnd) { break; }
            word[index] = slicedArray[index - indexStart];
        }
    }

    public static void shuffleWord(char[] word) {
        // Pour chaque lettre du mot, un index d'une autre lettre est attribué au hasard.
        for (int index = 0; index < word.length - 1; index ++) {
            int letterIndex = randomIndex.nextInt(word.length);
            swapLetter(word, index, letterIndex);
        }
    }

    public static void swapLetter(char[] word, int firstIndex, int secondIndex) {
        char tempLetter = word[firstIndex];
        word[firstIndex] = word[secondIndex];
        word[secondIndex] = tempLetter;
    }

}
