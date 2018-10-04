package stacks;

import java.util.Stack;

/**
 * Time Complexity is O(n) Space
 * Complexity is O(n) 
 * 1) Push the first element to stack. 
 * 2) Pick rest of the elements one by one and follow following steps in loop. 
 *   ….a) Mark the current element as next.
 *   ….b) If stack is not empty, then pop an element from stack and compare it with next. 
 *   ….c) If next is greater than the popped element, then next is the next greater element for the popped element. 
 *   ….d) Keep popping from the stack while the popped element is smaller than next. next becomes the next greater element for all such popped elements 
 *   ….g) If next is smaller than the popped element, then push the popped element back. 
 * 3) After the loop in step 2 is over, pop all the elements from stack and print -1 as next element for them.
 * 
 * 
 *
 */
public class NextGreaterElement {
	public static void printNextGreaterElement(int[] input) {
		Stack<Integer> stack = new Stack<Integer>();
		int inputSize = input.length;
		stack.push(input[0]);
		for (int i = 1; i < inputSize; i++) {
			// If Stack Not Empty and Element in array is greater than stack top
			while (!stack.isEmpty() && input[i] > stack.peek()) {
				System.out.println("Next greater element for " + stack.pop() + "\t = " + input[i]);
			}
			// Else Just push element into stack
			stack.push(input[i]);
		}
		while (!stack.isEmpty()) {
			int top = (int) stack.pop();
			System.out.println("Next greater element for " + top + "\t = " + null);
		}
	}

	public static void main(String[] args) {
		int[] input = { 98, 23, 54, 12, 20, 7, 27 };
		printNextGreaterElement(input);
	}
}
