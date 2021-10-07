package Blind75.Strings;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 *
 * Example 4:
 * Input: s = "([)]"
 * Output: false
 *
 * Example 5:
 * Input: s = "{[]}"
 * Output: true
 *
 */

public class BalancedParenthsis {

	public static void main(String[] args) {
		String[] inputs = { "{[()]}", "{[(])}", "{{[[(())]]}}", "()", "()[]{}", "(]", "([)]", "{[]}" };

		for (String input : inputs) {
			boolean flag = checkBalancedParentheses(input);
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean checkBalancedParentheses(String input) {
		Stack<String> stack = new Stack<String>();
		boolean isBalanaced = false;

		for (int i = 0; i < input.length(); i++) {
			String str = "" + input.charAt(i); //store characters as String

			//if opening bracket then push into stack
			if (str.equals("(") || str.equals("[") || str.equals("{")) {
				stack.push(str);
			}

			//if closing bracket, pop bracket and compare if its a pair
			if (str.equals(")") || str.equals("]") || str.equals("}")) {
				//if stack becomes empty in between then also its not balanced
				if (stack.isEmpty()) {
					return false;
				}
				String opening = stack.peek();
				if (str.equals(")") && opening.equals("(")) {
					stack.pop();
				}
				if (str.equals("]") && opening.equals("[")) {
					stack.pop();
				}
				if (str.equals("}") && opening.equals("{")) {
					stack.pop();
				}
			}
		}
		//if stack is empty at end, then its balanced
		if (input.length() > 0 && stack.isEmpty()) {
			isBalanaced = true;
		}

		return isBalanaced;
	}
}
