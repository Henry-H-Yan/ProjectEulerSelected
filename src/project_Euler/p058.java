package project_Euler;

public final class p058 {
	
	public static void main(String[] args) {
	
		int numPrimes = 0;
		for (int n = 1; ; n += 2) {
			for (int i = 0; i < 4; i++) {
				if (isPrime(n * n - i * (n - 1)))
					numPrimes++;
			}
			if (n > 1 && numPrimes * 10 < n * 2 - 1)
				System.out.println( Integer.toString(n));
		}
		
	}
	
	public static boolean isPrime(int in){
		for(int i=0; i < in/2; i++){
			if((in % i) == 0) return false;
		}
		return true;
		
		
	}
	
}