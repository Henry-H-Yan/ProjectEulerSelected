package project_Euler;

public class p011 {
	final static int TOTAL = 1000;

	public static void main(String[] args) {
	    int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
	    int[] ways = new int[TOTAL + 1];
	    ways[0] = 1;

	    // dynamic programming,
	    // subproblem: ways[i] means the number of ways i can be constructed
	    for (int coin : coins) {
	        for (int j = coin; j <= TOTAL; j++) {
	        	if(j - coin>=0)	 ways[j] += ways[j - coin];
	        }
	    }

	    System.out.println("Result: " + ways[TOTAL]);
	}
}
