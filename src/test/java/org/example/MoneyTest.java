package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Money;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MoneyTest {

	private static Money m;
	
	@BeforeAll
	public static void init() {
		m = new Money(20, "EUR");
	}
	
	@Test
	void test() {
		assertTrue(m.amount() > 0);
	}

}
