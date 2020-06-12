package eni.initiationjava.module7;

import java.util.Scanner;

/**
 * Permet d'encoder une chaine de caractère.
 *
 * @author Dyrits
 */

public class Cryptage {
    public static void main(String[] args) {
        Scanner askInput = new Scanner(System.in);
        System.out.print("Entrez une phrase à encoder ou décoder (en majuscule) : ");
        String toEncodeDecode = askInput.nextLine().toUpperCase(); // On s'assure que les lettres soient en majuscules.
        String encodeKey;
        do {
            System.out.print("Entrez une clé de cryptage valide de 8 lettres : ");
            encodeKey = askInput.nextLine().toUpperCase();
        } while (!keyValidity(encodeKey));
        System.out.println("La phrase encodée est : ");
        System.out.println(encodeString(toEncodeDecode, encodeKey));
        System.out.println("La phrase décodée est : ");
        System.out.println(decodeString(toEncodeDecode, encodeKey));
    }

    public static boolean keyValidity(String key) {
        // La clé est valide seulement si elle contient 1 à 8 lettres majuscules:
        return key.toUpperCase().matches("[A-Z]{1,8}"); // Expression régulière.
    }

    public static String encodeString(String toEncode, String encodeKey) {
        StringBuilder decodedString = new StringBuilder(); // Plus ou moins l'équivalent de déclarer une chaîne vide.
        for (int index = 0; index < toEncode.length(); index++) {
            // Si le caractère n'est pas une lettre, on passe à l'itération suivante.
            if (!Character.isLetter(toEncode.charAt(index))) {
                decodedString.append(toEncode.charAt(index));
                continue;
            }
            // En attribuant un caractère à un entier, celui-ci enregistre sa valeur ASCII.
            int letter = toEncode.charAt(index);
            /* L'index de la lettre utilisé est celle du reste de la division de l'index par la longueur de la clé.
            Exemple avec index 25 et clé de taille 8 :
            25 % 8 = 1 soit le premier index (qui est la deuxième lettre). */
            int keyLetter = encodeKey.charAt(index % encodeKey.length());
            /* Le reste de la division entière de la somme des valeurs de la lettre et de la clé de cryptage par 26...
             ...correspond à l'écart de la lettre encodée par rapport à A.
             Exemple avec la lettre C et la clé F :
             Les valeurs en ASCII sont : C = 67, F = 70, A = 65
             (67 + 70) % 26 + 65 = 72 ce qui correspond à H. */
            char encodedLetter = (char) ((letter + keyLetter) % 26 + 'A');
            decodedString.append(encodedLetter); // Plus ou moins l'équivalent d'une concaténation.
        }
        return decodedString.toString();
    }

    public static String decodeString(String toDecode, String encodeKey) {
        StringBuilder decodedString = new StringBuilder();
        for (int index = 0; index < toDecode.length(); index++) {
            if (!Character.isLetter(toDecode.charAt(index))) {
                decodedString.append(toDecode.charAt(index));
                continue;
            }
            int letter = toDecode.charAt(index);
            int keyLetter = encodeKey.charAt(index % encodeKey.length());
             /* Le reste de la division entière de la différence des valeurs de la lettre et de la clé de cryptage...
             ...par 26 correspond à l'écart de la lettre décodée par rapport à A si positif, Z si négatif.
             On utilise Math.max() et Math.min() afin de garantir un résultat positif. */
            char encodedLetter = (char) ((Math.max(letter, keyLetter) - Math.min(letter, keyLetter)) % 26 + 'A');
            decodedString.append(encodedLetter);
        }
        return decodedString.toString();
    }
}
