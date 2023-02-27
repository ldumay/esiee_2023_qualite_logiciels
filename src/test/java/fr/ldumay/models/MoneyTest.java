package fr.ldumay.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe : MoneyTest
 * <br/>Description : Classe de test de la classe Money
 *
 * @author ldumay
 */
@DisplayName("MoneyTest")
class MoneyTest {

	Money moneyEUR = new Money(20, Currency.EUR);
	Money moneyGBP = new Money(30, Currency.GBP);

	/**
	 * Tests qui s'exécutent avant tous les tests.
	 */
	@BeforeAll
	static void beforeAll() {
		System.out.println("[Before all]");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("[Before each]");
	}

	/**
	 * Un test de démonstration
	 */
	@Test
	@DisplayName("testDemo()")
	void testDemo() {
		System.out.println("[@testDemo]");
	}

	@Test
	@DisplayName("Money.add() | all methodes | assertEquals")
	void add() {
		System.out.println("[Test - all]");

		//-Test avec assertTime, assertAll et assertEquals
		assertTimeout(Duration.ofMillis(10), () -> {
			assertAll("Groupe de tests",
					() -> assertEquals(40, moneyEUR.add(20, Currency.EUR).amount()),
					() -> assertEquals(70, moneyGBP.add(new Money(40, Currency.GBP)).amount())
			);
		});
	}

	@Test
	@DisplayName("Money.add() | exception | assertThrows")
	void addException(){
		//-Test avec assertThrows et assertEquals
		IllegalArgumentException ex = assertThrows(
				IllegalArgumentException.class, // Type d'exception attendue
				() -> moneyEUR.add(null), // Code à exécuter
				"erreur d'exception" // Message d'erreur d'assertion en cas d'échec
		);
		assertEquals(
				"Money is null", // Message attendu pour l'exception
				ex.getMessage(), // Message obtenu
				"Erreur : Message d'erreur différent" // Message d'erreur d'assertion en cas d'échec
		);
	}

	@Test
	@DisplayName("Money.add() | timeout | assertTimeout")
	void addTimeout(){
		//-Test avec assertTimeout
		assertTimeout(
			Duration.ofMillis(10), // Durée maximale d'exécution
			() -> moneyEUR.add(20, Currency.EUR), // Code à exécuter
			"Erreur : Timeout" //
		);
	}

	@AfterEach
	void afterEach() {
		System.out.println("[After each]");
	}

	/**
	 * Tests qui s'exécutent après tous les tests.
	 */
	@AfterAll
	static void afterAll() {
		System.out.println("[After all]");
	}

}
