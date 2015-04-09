package project_Euler;

import java.math.BigInteger;

/**
 * 
 * Starting in the top left corner of a 2×2 grid, 
 * and only being able to move to the right and down, 
 * there are exactly 6 routes to the bottom right corner.


 * How many such routes are there through a 20×20 grid?
 * 
 *              n!
C(n,r) =    -----———-
             r!*(n-r)!
 * @author henry-yan
 *
 */
public class p015 {

	public static void main(String[] args) {
		System.out.println( binomial(40,20));
	}
	
	
	public static BigInteger binomial(int n, int k) {
		return factorial(n).divide(factorial(n - k).multiply(factorial(k)));
	}
	
	public static BigInteger factorial(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Input can't be nagative");
		BigInteger ret = BigInteger.ONE;
		
		for (int i = 2; i <= n; i++)
			ret = ret.multiply(BigInteger.valueOf(i));
		return ret;
	}
	
	
}
