package project_Euler;

import java.math.BigInteger;
import java.util.ArrayList;

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
		int [] denom= {1,2,5,10,20};
		System.out.println(opt ( 30,denom ) );

	}

	public static  int opt(int val, int[] denom){
		int[] dp= new int[val+1];
		dp[0]=0;
		ArrayList<Integer> list= new ArrayList<Integer> ();
		for(int d:denom){dp[d]=1;}
		for(int v=1;v<=val;v++){
			for(int d:denom){

				if(val-d>=0) list.add(dp[val-d]+1);

			}
			dp[v]= getMin(list);


		}
		return dp[val];
	}

	public static int getMin(ArrayList<Integer> list){
		int ret=-100;
		for(int cur:list) {ret= Math.min(ret, cur);}
		return ret;

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
