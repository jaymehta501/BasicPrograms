package stacks;

import java.util.*;

//import junit.framework.Assert;

/**
 * 1) Create a stack to store operands
 * (or values).
 *  2) Scan the given
 * expression and do following for every
 * scanned element. …..a) If the element
 * is a number, push it into the stack
 * …..b) If the element is a operator,
 * pop operands for the operator from
 * stack. Evaluate the operator and push
 * the result back to the stack
 *  3) When
 * the expression is ended, the number
 * in the stack is the final answer
 * 
 * 
 *
 */
public class EvaluatePostFix {
	private static final char ADD = '+', SUBTRACT = '-';
	private static final char MULTIPLY = '*', DIVIDE = '/';
	private static final char POWER = '^';

	static public int evaluate(String expr) {
		//   assert (isValid(expr));

		Stack stack = new Stack();
		int op1, op2, result = 0;
		String token;
		StringTokenizer tokenizer = new StringTokenizer(expr);

		while (tokenizer.hasMoreTokens()) {
			token = tokenizer.nextToken();
			char c = token.charAt(0);
			if (isOperator(c)) {
				op2 = ((Integer) stack.pop()).intValue();
				op1 = ((Integer) stack.pop()).intValue();
				result = evalSingleOp(token.charAt(0), op1, op2);
				stack.push(new Integer(result));
			} else
				stack.push(new Integer(Integer.parseInt(token)));
		}

		result = ((Integer) stack.pop()).intValue();
		return result;
	}

	static private int evalSingleOp(char operation, int op1, int op2) {
		int result = 0;

		switch (operation) {
		case ADD:
			result = op1 + op2;
			break;
		case SUBTRACT:
			result = op1 - op2;
			break;
		case MULTIPLY:
			result = op1 * op2;
			break;
		case DIVIDE:
			result = op1 / op2;
		case POWER:
			result = (int) Math.pow(op1, op2);
		}

		return result;
	}

	static private boolean isOperator(char c) { // Tell whether c is an operator.

		return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')';

	}

	public static void main(String[] args) { // Test method for the class.

		EvaluatePostFix converter = new EvaluatePostFix();

		//Assert.assertEquals("2+3", converter.evaluate("23+"));

	} // end main

}
