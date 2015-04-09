package project_Euler;
/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 * @author henry-yan
 *
 */
public class p009 {

	public static void main(String[] args) {
		boolean found=false;
		for (int a = 1; a < 1000; a++) {
			for (int b = a + 1; b < 1000; b++) {
				int c = 1000 - a - b;
				if (a * a + b * b == c * c)  // Note: This implies b < c
					System.out.println( Integer.toString(a * b * c));
				found= true;
			}
		}
		if(!found) throw new AssertionError("Doesn't exist");
	}
}
