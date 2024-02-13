package com.dizzy.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicJunitTest {
	int a=2;
	@Test
	public void basicTesting() {
		System.out.println("Basic testing");
		assertEquals(2, a);
	}

}
