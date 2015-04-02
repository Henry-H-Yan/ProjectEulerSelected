package project_Euler;

public class p7 {

	public static void main(String[] args) { 
		int N=106001;
		/**
		 * 
		 * )By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
		 */

		// initially assume all integers are prime
		boolean[] isPrimeTable = new boolean[N + 1];
		for (int i = 2; i <= N; i++) {
			isPrimeTable[i] = true;
		}

		for (int i = 2; i*i <= N; i++) {

			// Sieve algorithms 
			if (isPrimeTable[i]) {
				for (int j = i; i*j <= N; j++) {
					isPrimeTable[i*j] = false;
				}
			}
		}

		// count primes
		int count=0;
		for (int i = 2; i <= N; i++) {
			if (isPrimeTable[i]) count++;
			if(count==10001) {System.out.println("No. 10001th prime number is "+ i); break;}
		}

	}

}
