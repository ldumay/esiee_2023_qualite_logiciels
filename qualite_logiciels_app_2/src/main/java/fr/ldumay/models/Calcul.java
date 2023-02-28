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
     * Méthode de calcul de la racine carrée d'un nombre entier,
     * le nombre entier étant un nombre positif (strictement supérieur à 0 et non nul).
     * @param a : Integer - Nombre entier
     * @return : double - Racine carrée du nombre entier
     */
    public Double racineCarree(Integer a) {
        //Vérification de la non-nullité du paramètre
        if(a == null) throw new IllegalArgumentException("Entier nul");

        //Vérification de la valeur du paramètre
        if(a < 0) throw new IllegalArgumentException("Entier négatif");

        //Calcul de la racine carrée
        return Math.sqrt(a); // Math.sqrt() est une méthode statique de la classe Math
    }

    /**
     * Méthode de calcul de toutes les racines carrées des nombres compris entre A et B,
     * A et B étant deux nombres entiers positifs (strictement supérieurs à 0 et non nuls)
     * tels que A < B.
     * @param a : Integer - Nombre entier A
     * @param b : Integer - Nombre entier B
     * @return : Double[] - Tableau des racines carrées des nombres compris entre A et B
     */
    public Double[] allRacineCarree(Integer a, Integer b) {
        //Vérification de la non-nullité des paramètres
        if(a==null) throw new IllegalArgumentException("Entier a nul");
        else if(b==null) throw new IllegalArgumentException("Entier b nul");
        else if(a==null && b==null) throw new IllegalArgumentException("Entier a et b nuls");

        //Vérification de la valeur du paramètre
        if(a<0) throw new IllegalArgumentException("Entier a négatif");
        else if(b<0) throw new IllegalArgumentException("Entier b négatif");
        else if(a<0 && b<0) throw new IllegalArgumentException("Entier a et b négatifs");

        Double[] tab = new Double[b - a + 1];
        for (int i = a; i <= b; i++) {
            tab[i - a] = racineCarree(i);
        }
        return tab;
    }
}
