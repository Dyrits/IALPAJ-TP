package eni.initiationjava.module7;

/**
 * Permet d'établir une suite logique avec un niveau de profondeur définie.
 * @author Dyrits
 */

public class Suite {
    public static void main(String[] args) {
        String initialSuite  = "1";
        updateSuite(initialSuite, 40);
    }

    public static void updateSuite(String suite, int depth) {
        System.out.println(suite);
        StringBuilder partialSuite = new StringBuilder();
        StringBuilder updatedSuite = new StringBuilder();
        int index = 0;
        while (index < suite.length()) {
            if (partialSuite.length() == 0 || suite.charAt(index) == partialSuite.charAt(partialSuite.length() - 1)) {
                partialSuite.append(suite.charAt(index));
                index ++;
                if (index != suite.length()) { continue; }
            };
            updatedSuite.append(partialSuite.length());
            updatedSuite.append(partialSuite.charAt(0));
            partialSuite = new StringBuilder();
        }
        if (depth > 0) { updateSuite(updatedSuite.toString(), depth - 1); }
    }

    /* Méthode similaire alternative avec un boucle plutôt qu'une récursion:
    public static void main(String[] args) {
        String initialSuite  = "1";
        int depth = 40;
        while (depth > 0) {
            System.out.println(initialSuite);
            StringBuilder partialSuite = new StringBuilder();
            StringBuilder updatedSuite = new StringBuilder();
            int index = 0;
            while (index < initialSuite.length()) {
                if (partialSuite.length() == 0 || initialSuite.charAt(index) == partialSuite.charAt(partialSuite.length() - 1)) {
                    partialSuite.append(initialSuite.charAt(index));
                    index ++;
                    if (index != initialSuite.length()) { continue; }
                };
                updatedSuite.append(partialSuite.length());
                updatedSuite.append(partialSuite.charAt(0));
                partialSuite = new StringBuilder();
            }
            initialSuite = updatedSuite.toString();
            depth --;
        }
    }
    */
}
