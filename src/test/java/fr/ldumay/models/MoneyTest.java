package fr.ldumay.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

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
	 * Tests principaux.
	 */
	@Test
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
