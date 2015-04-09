package project_Euler;

public final class p036{

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i < 1000000; i++) {
			if (isPalindrome(Integer.toString(i, 10)) &&isPalindrome(Integer.toString(i, 2)))
				sum += i;
			System.out.println( Integer.toString(sum) );
		}
	}

	public static boolean isPalindrome(String a){
		if(a.length()<=1) return true;
		if ( a.charAt(0)== a.charAt(a.length()-1)) {
			return isPalindrome(a.substring(1,a.length()-1));
		}
		return false;
	}


}