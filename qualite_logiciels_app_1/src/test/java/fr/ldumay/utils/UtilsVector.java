package fr.ldumay.utils;

import fr.ldumay.models.Vector;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Classe : UtilsVector
 * <br/>Description : Classe des utilitaires des vecteurs
 *
 * @author ldumay
 */

@DisplayName("Classe des utilitaires des vecteurs")
public class UtilsVector {

    static Vector a = new Vector();
    static Vector b = new Vector();

    @BeforeAll
    void beforeAll(){
        a.setValues(new int[]{1,2,3});
        b.setValues(new int[]{4,5,6});
    }

    @Test
    @DisplayName("Test de l'union de deux vecteurs")
    void testUnionSet(){
        Vector unionVector = UtilsVector.unionSet(a, b);
        System.out.println("Vecteur A : " + a.getValues());
        System.out.println("Vecteur B : " + b.getValues());
        System.out.println("Vecteur Union : " + unionVector.getValues());
    }

    @AfterAll
    void afterAll(){
        System.out.println("Fin des tests");
        System.out.println("Vecteur A : " + a.getValues());
        System.out.println("Vecteur B : " + b.getValues());
    }
}
