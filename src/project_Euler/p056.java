package project_Euler;


import java.math.BigInteger;


public final class p056  {
	static int sum = 0;
	public static void main(String[] args) {

		int max = 0;
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				BigInteger pow = BigInteger.valueOf(a).pow(b);
				max = Math.max(sum, max);
			}
		}
		System.out.println( Integer.toString(max));
	}


	private static void digitSum(BigInteger n) {

		String s = n.toString();
		for (int i = 0; i < s.length(); i++)
			sum += s.charAt(i) - '0';


	}

}