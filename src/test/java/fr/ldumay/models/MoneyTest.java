package fr.ldumay.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

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
	@DisplayName("Test @testDemo")
	void testDemo() {
		System.out.println("[Test - @testDemo]");
	}

	@Test
	@DisplayName("Test assertEquals on methods @add")
	void add() {
		System.out.println("[Test - assertEquals on methods @add]");
		//-
		assertEquals(40, moneyEUR.add(20, Currency.EUR).amount());
		assertEquals(70, moneyGBP.add(new Money(40, Currency.GBP)).amount());
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
