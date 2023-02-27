package fr.ldumay.utils;

import fr.ldumay.models.Vector;

/**
 * Classe : UtilsVector
 * <br/>Description : Classe des utilitaires des vecteurs
 *
 * @author ldumay
 */
public class UtilsVector {
    public static Vector unionSet(Vector a, Vector b) {
        // Création du vecteur
        Vector unionVector = new Vector();
        // Préparation des valeurs
        int[] values = new int[0];
        // Vérification des valeurs du vecteur A
        if(a.getValues().length>0)
            values = new int[a.getValues().length + b.getValues().length];
        // Vérification des valeurs du vecteur B
        if(b.getValues().length>0)
            values = new int[a.getValues().length + b.getValues().length];
        // Insertion des valeurs récupérées dans le vecteur d'union
        unionVector.setValues(values);
        // Renvoi le vecteur
        return unionVector;
    }
}
