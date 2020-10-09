package com.bridgelabz.capgemini.testmaximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FindMaxTest 
{
	@Test
	public void maximumIntegerAtPosition1() {
		FindMax<Integer> findMax = new FindMax<>(5, 4, 3);
		int max = findMax.getMax();
		assertEquals(5, max);
	}

	@Test
	public void maximumIntegerAtPosition2() {
		FindMax<Integer> findMax = new FindMax<>(5, 9,4 );
		int max = findMax.getMax(5, 9, 4);
		assertEquals(9, max);
	}

	@Test
	public void maximumIntegerAtPosition3() {
		FindMax<Integer> findMax = new FindMax<>(5, 4, 20);
		int max = findMax.getMax(5, 4, 20);
		assertEquals(20, max);
	}
	
	@Test
	public void maximumFloatAtPosition1() {
		FindMax<Double> findMax = new FindMax<>(5.333, 4.54, 3.52);
		double max = findMax.getMax();
		assertEquals(5.333, max,.001);
	}
	@Test
	public void maximumFloatAtPosition2() {
		FindMax<Double> findMax = new FindMax<>(5.333, 14.54, 3.52);
		double max = findMax.getMax();
		assertEquals(14.54, max,.001);
	}
	@Test
	public void maximumFloatAtPosition3() {
		FindMax<Double> findMax = new FindMax<>(5.333, 4.54, 13.52);
		double max = findMax.getMax();
		assertEquals(13.52, max,.001);
	}
	
	@Test
	public void maximumStringAtPosition1() {
		FindMax<String> findMax = new FindMax<>("Peach","Apple", "Banana");
		String max = findMax.getMax( );
		assertEquals("Peach", max);
	}
	@Test
	public void maximumStringAtPosition2() {
		FindMax<String> findMax = new FindMax<>("Apple","Peach", "Banana");
		String max = findMax.getMax();
		assertEquals("Peach", max);
	}
	@Test
	public void maximumStringAtPosition3() {
		FindMax<String> findMax = new FindMax<>("Banana","Apple", "Peach");
		String max = findMax.getMax();
		assertEquals("Peach", max);
	}
}
