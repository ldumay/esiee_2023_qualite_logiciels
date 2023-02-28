package fr.ldumay.models;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

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
    static Double[] valeursAttendues;

    /**
     * Préparation du nécessaire pour les tests.
     */
    @BeforeAll
    static void beforeAll(){
        //Préparation des variables
        calcul = new Calcul();
        resultats = new HashMap<>();
        //Préparation de racines carrées de 1 à 6
        valeursAttendues = new Double[6];
        valeursAttendues[0] = 1.0;
        valeursAttendues[1] = 1.4142135623730951;
        valeursAttendues[2] = 1.7320508075688772;
        valeursAttendues[3] = 2.0;
        valeursAttendues[4] = 2.23606797749979;
        valeursAttendues[5] = 2.449489742783178;
        //-
        resultats.put("Before-Test", "OK");
    }

    /**
     * Test d'exécution de la méthode racineCarree().
     */
    @Test
    @DisplayName("racineCarree() | Exécution")
    void testCalculRacineCarreeExecution() {
        //Vérification des égalités
        assertEquals(1, calcul.racineCarree(1));
        assertEquals(2, calcul.racineCarree(4));
        //Vérification des inégalités
        assertNotEquals(1, calcul.racineCarree(2));
        assertNotEquals(2, calcul.racineCarree(5));
        //-
        resultats.put("Execution-Test-RacineCarree", "OK");
    }

    /**
     * Test d'exception de la méthode racineCarree().
     */
    @Test
    @DisplayName("racineCarree() | Exception")
    void testCalculRacineCarreeExecption() {
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
        resultats.put("Exception-Test-RacineCarree", "OK");
    }

    /**
     * Test de temps d'exécution de la méthode racineCarree().
     */
    @Test
    @DisplayName("racineCarree() | Temps d'exécution")
    void testCalculRacineCarreeTimeout() {
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
        resultats.put("Timeout-Test-RacineCarree", "OK");
    }

    /**
     * Test d'exécution de la méthode allracineCarree().
     */
    @Test
    @DisplayName("allRacineCarree() | Exécution")
    void testCalculAllRacineCarreExecution() {
        //Vérification des égalités
        assertArrayEquals(valeursAttendues, calcul.allRacineCarree(1,6));
        //Vérification des inégalités
        assertNotEquals(valeursAttendues, calcul.allRacineCarree(1,5));
        //-
        resultats.put("Execution-Test-allRacineCarree()", "OK");
    }

    /**
     * Test d'exception de la méthode allracineCarree().
     */
    @Test
    @DisplayName("allRacineCarree() | Exception")
    void testCalculAllRacineCarreeExecption() {
        //Vérification des exceptions
        //-exception1
        IllegalArgumentException exception1 = assertThrows(
                IllegalArgumentException.class,
                () -> calcul.allRacineCarree(null, null),
                "Erreur d'exception"
        );
        if(exception1.getMessage().equals("Entier a nul")){
            assertEquals(
                    "Entier a nul",
                    exception1.getMessage(),
                    "Erreur de message d'exception"
            );
        } else if(exception1.getMessage().equals("Entier b nul")){
            assertEquals(
                    "Entier b nul",
                    exception1.getMessage(),
                    "Erreur de message d'exception"
            );
        } else if(exception1.getMessage().equals("Entier a et b nuls")){
            assertEquals(
                    "Entier a et b nuls",
                    exception1.getMessage(),
                    "Erreur de message d'exception"
            );
        } else {
            fail("Erreur de message d'exception");
        }
        //-exception2
        IllegalArgumentException exception2 = assertThrows(
                IllegalArgumentException.class,
                () -> calcul.allRacineCarree(-1, -1),
                "Erreur d'exception"
        );
        if(exception2.getMessage().equals("Entier a négatif")){
            assertEquals(
                    "Entier a négatif",
                    exception2.getMessage(),
                    "Erreur de message d'exception"
            );
        } else if(exception2.getMessage().equals("Entier b négatif")){
            assertEquals(
                    "Entier b négatif",
                    exception2.getMessage(),
                    "Erreur de message d'exception"
            );
        } else if(exception2.getMessage().equals("Entier a et b négatifs")){
            assertEquals(
                    "Entier a et b négatifs",
                    exception2.getMessage(),
                    "Erreur de message d'exception"
            );
        } else {
            fail("Erreur de message d'exception");
        }
        //-
        resultats.put("Exception-Test-AllRacineCarree", "OK");
    }

    /**
     * Test de temps d'exécution de la méthode allRacineCarree().
     */
    @Test
    @DisplayName("allRacineCarree() | Temps d'exécution")
    void testCalculAllRacineCarreeTimeout() {
        int time = 5;
        //Vérification du temps d'exécution
        assertTimeout(
                Duration.ofMillis(time),
                () -> calcul.allRacineCarree(1,2),
                "Erreur de temps d'exécution"
        );
        //-
        resultats.put("Timeout-Test-AllRacineCarree", "OK");
    }

    /**
     * Finalisation des tests.
     */
    @AfterAll
    static void afterAll(){
        //Vérification du résultat obtenu des tests
        assumeTrue(resultats.get("Before-Test").equals("OK"));
        assumeTrue(resultats.get("Execution-Test-RacineCarree").equals("OK"));
        assumeTrue(resultats.get("Execution-Test-allRacineCarree()").equals("OK"));
        assumeTrue(resultats.get("Exception-Test-RacineCarree").equals("OK"));
        assumeTrue(resultats.get("Exception-Test-AllRacineCarree").equals("OK"));
        assumeTrue(resultats.get("Timeout-Test-RacineCarree").equals("OK"));
        assumeTrue(resultats.get("Timeout-Test-AllRacineCarree").equals("OK"));
        //-
        resultats.put("After-Test", "OK");
        //Affichage des résultats
        System.out.println("Résultats des tests :");
        for(Map.Entry<String, String> resultat : resultats.entrySet()){
            System.out.println(resultat.getValue() + " : " + resultat.getKey());
        }
    }

}
