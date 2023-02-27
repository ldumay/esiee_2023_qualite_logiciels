package fr.ldumay.models;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe : CalculTest
 * <br/>Description : Classe de test de la classe Calcul
 *
 * @author ldumay
 */
@DisplayName("CalculTest")
class CalculTest {

    static Calcul calcul;
    static Map<String, String> resultats;

    /**
     * Préparation du nécessaire pour les tests.
     */
    @BeforeAll
    static void beforeAll(){
        calcul = new Calcul();
        resultats = new HashMap<>();
        //-
        resultats.put("Before-Test", "OK");
    }

    /**
     * Test d'exécution de la méthode racineCarree().
     */
    @Test
    @DisplayName("racineCarree() | Exécution")
    void testCalculExecution() {
        //Vérification des égalités
        assertEquals(1, calcul.racineCarree(1));
        assertEquals(2, calcul.racineCarree(4));
        //Vérification des inégalités
        assertNotEquals(1, calcul.racineCarree(2));
        assertNotEquals(2, calcul.racineCarree(5));
        //-
        resultats.put("Execution-Test", "OK");
    }

    /**
     * Test d'exception de la méthode racineCarree().
     */
    @Test
    @DisplayName("racineCarree() | Exception")
    void testCalculExecption() {
        //Vérification des exceptions
        //-exception1
        IllegalArgumentException exception1 = assertThrows(
                IllegalArgumentException.class,
                () -> calcul.racineCarree(null),
                "Erreur d'exception"
        );
        assertEquals(
                "Entier nul",
                exception1.getMessage(),
                "Erreur de message d'exception"
        );
        //-exception2
        IllegalArgumentException exception2 = assertThrows(
                IllegalArgumentException.class,
                () -> calcul.racineCarree(-1),
                "Erreur d'exception"
        );
        assertEquals(
                "Entier négatif",
                exception2.getMessage(),
                "Erreur de message d'exception"
        );
        //-
        resultats.put("Exception-Test", "OK");
    }

    /**
     * Test de temps d'exécution de la méthode racineCarree().
     */
    @Test
    @DisplayName("racineCarree() | Temps d'exécution")
    void testCalculTimeout() {
        int time = 2;
        //Vérification du temps d'exécution
        assertTimeout(
                Duration.ofMillis(time),
                () -> calcul.racineCarree(1),
                "Erreur de temps d'exécution"
        );
        assertTimeout(
                Duration.ofMillis(time),
                () -> calcul.racineCarree(4),
                "Erreur de temps d'exécution"
        );
        //-
        resultats.put("Timeout-Test", "OK");
    }

    /**
     * Finalisation des tests.
     */
    @AfterAll
    static void afterAll(){
        //Vérification du résultat obtenu des tests
        assumeTrue(resultats.get("Before-Test").equals("OK"));
        assumeTrue(resultats.get("Execution-Test").equals("OK"));
        assumeTrue(resultats.get("Exception-Test").equals("OK"));
        assumeTrue(resultats.get("Timeout-Test").equals("OK"));
        //-
        resultats.put("After-Test", "OK");
        //Affichage des résultats
        System.out.println("Résultats des tests :");
        for(Map.Entry<String, String> resultat : resultats.entrySet()){
            System.out.println(resultat.getValue() + " : " + resultat.getKey());
        }
    }

}
