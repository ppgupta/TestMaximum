package com.bridgelabz.capgemini.testmaximum;

/**
 * Hello world!
 *
 */
public class FindMax 
{
	public void printWelcome() {
		System.out.println("Welcome");
	}
    
	public Integer  getMax(Integer x,Integer y,Integer z) {
		Integer maximum=x;
    	if(y.compareTo(maximum)>0)
    		maximum=y;
    	if(z.compareTo(maximum)>0)
    		maximum=z;
    	return maximum;
    } 
	public Double  getMax(Double x,Double y,Double z) {
		Double maximum=x;
    	if(y.compareTo(maximum)>0)
    		maximum=y;
    	if(z.compareTo(maximum)>0)
    		maximum=z;
    	return maximum;
    } 
	
	
	

}
