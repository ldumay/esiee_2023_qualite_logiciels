package fr.ldumay;

import fr.ldumay.models.Calcul;

/**
 * Classe : Main
 * <br/>Description : Classe principale de l'application
 * permettant d'utiliser la classe Calcul.
 *
 * @author ldumay
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Calcul");
        Calcul calcul = new Calcul();
        //-
        System.out.println("- - -");
        //-
        for(int i = 1; i <= 6; i++) {
            System.out.println("Racine carrée de " + i + " : " + calcul.racineCarree(i));
        }
        //-
        System.out.println("- - -");
        //-
        System.out.println("Racine carrée de 1 à 6 : ");
        for(double d : calcul.allRacineCarree(1, 6)) {
            System.out.println("- " + d);
        }
    }
}