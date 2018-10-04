package stacks;

import java.util.Stack;

/**
 * TimeComplexity O(n ^ 2). And requires no any extra memory.
 * Stack operates on LIFO operation, so
 * even if you use multiple
 * recursion(which is in turn using
 * stacks in OS level) wont bring you
 * the direct solution. Let’s attempt
 * the following approach:
 * 
 * 1.pop the element from the stack.
 * 
 * 2.Get the last element in the stack.
 * 
 * 3. Remove that last element from the
 * stack and assign it to temp.
 * variable.
 * 
 * 4. Start building the stack(by simply
 * adding once the size of stack upon
 * recursive call becomes 0).
 * 
 * 
 *
 */
public class StackReversal {
	public static void stackReversal(Stack<Integer> s) {
		if (s.size() == 0)
			return;
		int n = getLast(s);
		stackReversal(s);
		s.push(n);
	}

	public static int getLast(Stack<Integer> s) {
		int a = s.pop();
		if (s.size() == 0) {
			return a;
		} else {
			int k = getLast(s);
			s.push(a);
			return k;
		}
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stackReversal(stack);
		while (stack.size() > 0) {
			System.out.println(stack.pop());
		}
	}
}
