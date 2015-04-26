package project_Euler;
import java.math.BigInteger;


public final class p097  {

	public static void main(String[] args) {
		BigInteger modulus = BigInteger.TEN.pow(10);
		BigInteger n = BigInteger.valueOf(2);
		n=n.modPow(BigInteger.valueOf(7830457), modulus);
		
		n = n.multiply(BigInteger.valueOf(28433)).mod(modulus);
		n = n.add(BigInteger.ONE).mod(modulus);
		System.out.println( String.format("%010d", n));
	}

}