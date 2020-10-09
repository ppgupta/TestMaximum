package com.bridgelabz.capgemini.testmaximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FindMaxTest 
{
	@Test
	public void maximumIntegerAtPosition1() {
		FindMax findMax = new FindMax();
		int max = findMax.getMax(5, 4, 3);
		assertEquals(5, max);
	}

	@Test
	public void maximumIntegerAtPosition2() {
		FindMax findMax = new FindMax();
		int max = findMax.getMax(5, 9, 4);
		assertEquals(9, max);
	}

	@Test
	public void maximumIntegerAtPosition3() {
		FindMax findMax = new FindMax();
		int max = findMax.getMax(5, 4, 20);
		assertEquals(20, max);
	}
}
