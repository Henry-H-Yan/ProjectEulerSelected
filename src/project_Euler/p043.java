package project_Euler;

/*
 * The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.

Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:

d2d3d4=406 is divisible by 2
d3d4d5=063 is divisible by 3
d4d5d6=635 is divisible by 5
d5d6d7=357 is divisible by 7
d6d7d8=572 is divisible by 11
d7d8d9=728 is divisible by 13
d8d9d10=289 is divisible by 17
Find the sum of all 0 to 9 pandigital numbers with this property.
 */
public class p043 {

	private static int[] prime_List = {2, 3, 5, 7, 11, 13, 17};  //  primes


	public static void main(String[] args) {


		long sum = 0;
		int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		outer:
			do {
				for (int i = 0; i < prime_List.length; i++) {
					if (toInteger(digits, i + 1, 3) % prime_List[i] != 0)
						continue outer;
				}
				sum += toInteger(digits, 0, digits.length);
			} while (nextPermutation(digits));
		
		
		System.out.println(sum);
	}
	
	
	/**
	 *  {0 , 0, 0, 2} can turn to {0 ,0 2,0} so it works -> true
	 *  
	 *  { 2, 0,0,0 } has no following so it doesnt work  - false
	 * @param a
	 * @return
	 */

	public static boolean nextPermutation(int[] a) {
		int i, n = a.length;
		for (i = n - 2; ; i--) {
			if (i < 0)
				return false;
			if (a[i] < a[i + 1])
				break;
		}
		for (int j = 1; i + j < n - j; j++) {
			int tp = a[i + j];
			a[i + j] = a[n - j];
			a[n - j] = tp;
		}
		int j;
		for (j = i + 1; a[j] <= a[i]; j++);
		
		// swaping
		int tp = a[i];
		a[i] = a[j];
		a[j] = tp;
		return true;
	}



	private static long toInteger(int[] digits, int off, int len) {
		long result = 0;
		for (int i = off; i < off + len; i++)
			result = result * 10 + digits[i];
		return result;
	}
}
