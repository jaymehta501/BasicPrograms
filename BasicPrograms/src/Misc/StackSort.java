package Misc;

import java.util.Stack;

public class StackSort {
	public static void main(String[] args) {
		Stack<Integer> unSortedStack = new Stack();
		unSortedStack.push(new Integer(5));
		unSortedStack.push(new Integer(6));
		unSortedStack.push(new Integer(8));
		unSortedStack.push(new Integer(2));
		unSortedStack.push(new Integer(1));
		Stack<Integer> sortedStack = StackSort.sort(unSortedStack);
		while (!sortedStack.isEmpty()) {
			System.out.println(sortedStack.pop());
		}
	}

	public static Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> r = new Stack();
		while (!s.isEmpty()) {
			int tmp = s.pop();
			while (!r.isEmpty() && r.peek() > tmp) {
				s.push(r.pop());
			}
			r.push(tmp);
		}
		return r;
	}
}
