package eni.initiationjava.module5;

public class MaxCompare {

    public static void main(String[] args) {
        // Tests:
        System.out.println(max(125.75, 175.25)); // 175.25
        System.out.println(compare(17.5, 15.25)); // 1
        System.out.println(compare(64, 64.0)); // 0
    }

    public static double max(double value1, double value2) {
        // La méthode existe déjà avec la librairie Math:
        return Math.max(value1, value2);
        // Equivalent sans utiliser Math.max():
        // return value1 > value2 ? value1 : value2;
    }

    public static int compare(double value1, double value2) {
        // La méthode existe déjà avec la librairie Double:
        return Double.compare(value1, value2);
        // Equivalent sans utiliser Double.compare():
        // return value1 > value2 ? 1 : value2 > value1 ? -1 : 0;
    }
}
