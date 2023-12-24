/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x = (int)((Math.random() *a) + 1);
		int y = (int)((Math.random() *a) + 1);
		int z = (int)((Math.random() *a) + 1);
		System.out.println(x + " " +  y  + " " +  z) ;
		int smallest;
		if (x <= y && x <= z) {
			smallest = x;
		} else if (y <= z && y <= x) {
			smallest = y;
		} else {
			smallest = z;
		}
		System.out.println("the min is" + smallest) ;
		// Put your code here	
	}
}
