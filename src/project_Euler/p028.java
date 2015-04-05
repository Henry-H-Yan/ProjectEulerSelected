package project_Euler;

public final class p028 {


	private static final int SIZE = 1001;  
	public static void main(String[] args) {



		if((SIZE & 0x0)==1) {System.out.println("Size must be odd!"); }
		long sum = 1;  
		for (int n = 3; n <= SIZE; n += 2)
			sum += 4 * n * n - 6 * (n - 1);
		System.out.println( Long.toString(sum) );
	}

}