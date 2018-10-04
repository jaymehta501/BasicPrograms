package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Time Complexity : O(n) Auxiliary
 * Space : O(n) 1) Initialize Binary
 * Hash Map M[] = {0, 0, ...} 2) Do
 * following for each element A[i] in
 * A[] (a) If M[x - A[i]] is set then
 * print the pair (A[i], x - A[i]) (b)
 * Set M[A[i]]
 * 
 * 
 *
 */
public class PairSumWithHashMap {

	// 1. With HashMap
	public static void printSumPairs(int[] input, int k) {
		// Key is diff of Sum and Val at particular index & value is val at particular index
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {

			if (pairs.containsKey(input[i]))
				System.out.println(input[i] + ", " + pairs.get(input[i]));
			else
				pairs.put(k - input[i], input[i]);
		}

	}

	// 2.  Create Binary HashMap
	private static final int MAX = 100000; // Max size of Hashmap

	static void printpairs(int arr[], int sum) {
		// Declares and initializes the whole array as false
		boolean[] binmap = new boolean[MAX];

		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition
			if (temp >= 0 && binmap[temp]) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			binmap[arr[i]] = true;
		}
	}

	// Main to test the above function
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int n = 16;
	//	printpairs(A, n);
		printSumPairs(A, n);
	}
}
