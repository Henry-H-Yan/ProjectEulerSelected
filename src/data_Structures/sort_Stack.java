package data_Structures;

import java.util.Stack;

/**
 * use the idea of quick sort 
 * 
 * 
 * @author henry-yan
 *
 */


public class sort_Stack {
	public static Stack<Integer> sort(Stack<Integer> s) {
		if (s.isEmpty()) {
			return s;
		}
		int pivot = s.pop();

		// partition
		Stack<Integer> left  = new Stack<Integer>(); // can also use list, to do usual quicksort
		Stack<Integer> right = new Stack<Integer>();
		while(!s.isEmpty()) {
			int y = s.pop();
			if (y < pivot)  	left.push(y);
			else             right.push(y);

		}
	 	sort(right);    	sort(left); 

		// merge together
		Stack<Integer> tmp = new Stack<Integer>();
		while(!right.isEmpty()) 	tmp.push(right.pop());
		tmp.push(pivot);
		while(!left.isEmpty()) 			tmp.push(left.pop());


		while(!tmp.isEmpty())	s.push(tmp.pop());

		return s;
	}

	public static void main(String[] args) {
		int[] list= {1,23,53,56,2,34,14,53,62};
		Stack<Integer> stk= new Stack<Integer>();
		for(int i:list) stk.push(i);
		System.out.println(stk);

		Stack<Integer> sorted= sort(stk);
		System.out.println(sorted);

	}

}
