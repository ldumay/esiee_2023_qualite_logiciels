package fr.ldumay.models;

/**
 * Classe : Vector
 * <br/>Description : Classe des vecteurs
 * <ul>
 *     <li>name : String - Nom du vecteur</li>
 *     <li>values : int[] - Valeurs du vecteur</li>
 * </ul>
 *
 * @author ldumay
 */
public class Vector {

    private int[] values;

    /**
     * Constructeur
     */
    public Vector() {
        this.values = new int[0];
    }

    /**
     * Constructeur
     * @param values
     */
    public Vector(int[] values) {
        this.values = values;
    }

    //Getters & Setters
    public int[] getValues() { return values; }
    public void setValues(int[] values) { this.values = values; }
}
