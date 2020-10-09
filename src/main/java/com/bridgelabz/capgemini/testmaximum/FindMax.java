package com.bridgelabz.capgemini.testmaximum;

/**
 * Hello world!
 *
 */
public class FindMax <E extends Comparable<E>>
{ 
	private E x,y,z;
	public void printWelcome() {
		System.out.println("Welcome");
	}
    
	public FindMax(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public  E getMax() {
		return getMax(x, y, z);
	}

	public static <E extends Comparable<E>> E getMax(E a, E b, E c) {
		E max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}
	
	
	
	

}
