package fr.ldumay.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MoneyTest {

	private Money m;
	
	@BeforeAll
	public void init() {
		m = new Money(20, "EUR");
	}
	
	@Test
	void test() {
		assertTrue(m.amount() > 0);
	}

}
