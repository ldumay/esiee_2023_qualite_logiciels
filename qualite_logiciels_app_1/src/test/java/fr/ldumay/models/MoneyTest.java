package fr.ldumay.models;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
		System.out.println("moneyEUR.amount() = " + moneyEUR.amount());
		System.out.println("moneyGBP.amount() = " + moneyGBP.amount());

		//-Test avec assertTime, assertAll et assertEquals
		assertTimeout(Duration.ofMillis(10), () -> {
			assertAll("Groupe de tests",
					() -> assertEquals(40, moneyEUR.add(20, Currency.EUR).amount()),
					() -> assertEquals(70, moneyGBP.add(new Money(40, Currency.GBP)).amount())
			);
		});

		//-
		System.out.println("moneyEUR.amount() = " + moneyEUR.amount());
		System.out.println("moneyGBP.amount() = " + moneyGBP.amount());
	}

	@Test
	@DisplayName("Money.add() | exception | assertThrows")
	void addException(){
		System.out.println("[Test - exception]");
		System.out.println("moneyEUR.amount() = " + moneyEUR.amount());

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
		System.out.println("[Test - assertTimeout]");
		System.out.println("moneyEUR.amount() = " + moneyEUR.amount());

		//-Test avec assertTimeout
		assertTimeout(
			Duration.ofMillis(10), // Durée maximale d'exécution
			() -> moneyEUR.add(20, Currency.EUR), // Code à exécuter
			"Erreur : Timeout" //
		);
	}

	@Test
	@DisplayName("Money.add() | assumeTrue | assumeFalse")
	void addAssume(){
		System.out.println("[Test - assumeTrue/assumeFalse]");
		System.out.println("moneyEUR.amount() = " + moneyEUR.amount());
		System.out.println("moneyGBP.amount() = " + moneyGBP.amount());

		//-Test avec assumeTrue et assumeFalse
		assumeTrue(moneyEUR.amount() == 20); // Vrai si la condition est vraie
		assumeFalse(moneyGBP.amount() == 0); // Faux si la condition est fausse
	}

	@Test
	@DisplayName("Money.add() | assumeingThat")
	void addAssumingThat(){
		System.out.println("[Test - assumingThat]");
		System.out.println("moneyEUR.amount() = " + moneyEUR.amount());

		//-Test avec assumingThat
		assumingThat(moneyEUR.amount() == 20, () -> {
			System.out.println("True => moneyEUR.amount() == 20");
		});
	}

	@Test
	@EnabledOnOs(OS.MAC)
	@DisplayName("testForMacOS() | @EnabledOnOs(OS.MAC)")
	void testForMacOS(){
		System.out.println("[Test MacOS]");
	}

	@Test
	@EnabledOnOs(OS.WINDOWS)
	@DisplayName("testForWindows() | @EnabledOnOs(OS.WINDOWS)")
	void testForWindows(){
		System.out.println("[Test Windows]");
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
