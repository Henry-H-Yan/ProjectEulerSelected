package project_Euler;


/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 ¡Á 99.

Find the largest palindrome made from the product of two 3-digit numbers.

 * @author henry-yan
 *
 */

public class p004 {

	public static void main(String[] args) {
		System.out.println(new p004().run());
	}


	public String run() {
		int maxPalin = -1;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int cur = i * j;
				if (isPalindrome(String.valueOf(cur) )) maxPalin = maxPalin>=cur? maxPalin:cur;
			}
		}
		return Integer.toString(maxPalin);
	}

	public boolean isPalindrome(String s){
		if (s.length()<=1) return true;
		if(s.charAt(0)==s.charAt(s.length()-1)) return isPalindrome(s.substring(1, s.length()-1));
		return false;
	}

}
