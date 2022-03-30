package Week1.day1;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		int range=8;
		int fact=1;
		
		System.out.println(range);
		for(int i=1;i<range;i++) {
			fact =i*fact;
			if(range>i) {
				System.out.println("*"+(range-i));
				
				
			}
		}
	System.out.println("="+fact);	
		
	}
}




