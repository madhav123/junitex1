package com.dizzy.demo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/*
 * @Tag – declares tags for filtering tests
 */
public class TagingAndFilterEx {
	
    @Tag("taxes")
    @Test
    public void testingTaxCalculation() {
		System.out.print("testingTaxCalculation");
    }
	
    @Tag("taxes3")
	@Test
    public void testingTaxCalculationnewregion() {
		System.out.print("testingTaxCalculationnewregion");
    }
	

    @Tag("interest")
	@Test
    public void testingInterestCal() {
		System.out.print("testingInterestCal");
    }
}
