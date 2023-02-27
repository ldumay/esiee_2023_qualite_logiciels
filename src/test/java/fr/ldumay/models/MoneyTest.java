package fr.ldumay.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * Classe : MoneyTest
 * <br/>Description : Classe de test de la classe Money
 *
 * @author ldumay
 */
@DisplayName("MoneyTest")
class MoneyTest {

	Money money1 = new Money(20, "EUR");

	/**
	 * Tests qui s'exécutent avant tous les tests.
	 */
	@BeforeAll
	static void beforeAll() {
		System.out.println("[Before all]");
	}

	/*
	@BeforeEach
	void beforeEach() {}
	*/

	/**
	 * Un test.
	 */
	@Test
	@DisplayName("Test @test")
	void test() {
		System.out.println("[Test]");
		//-
		assertTrue(money1.amount() > 0);
	}

	/*
	@AfterEach
	void afterEach() {}
	*/

	/**
	 * Tests qui s'exécutent après tous les tests.
	 */
	@AfterAll
	static void afterAll() {
		System.out.println("[After all]");
	}

}
