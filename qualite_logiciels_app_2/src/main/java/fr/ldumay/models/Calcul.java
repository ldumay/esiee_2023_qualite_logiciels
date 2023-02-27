package fr.ldumay.models;

/**
 * Classe : Calcul
 * <br/>Description : Classe de calcul
 *
 * @author ldumay
 */
public class Calcul {

    /**
     * Constructeur : Calcul
     */
    public Calcul() {}

    /**
     * Méthode de calcul de la racine carrée d'un nombre entier.
     * @param a : int - Nombre entier
     * @return : double - Racine carrée du nombre entier
     */
    public double racineCarree(int a) {
        return Math.sqrt(a); // Math.sqrt() est une méthode statique de la classe Math
    }

    /**
     * Méthode de calcul de toutes les racines carrées des nombres compris entre A et B,
     * A et B étant deux nombres entiers tels que A < B.
     * @param a : int - Nombre entier A
     * @param b : int - Nombre entier B
     * @return : double[] - Tableau des racines carrées des nombres compris entre A et B
     */
    public double[] allRacineCarree(int a, int b) {
        double[] tab = new double[b - a + 1];
        for (int i = a; i <= b; i++) {
            tab[i - a] = racineCarree(i);
        }
        return tab;
    }
}
