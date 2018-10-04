package Arrays;

/**
 * Perform two things in a single
 * operation: 1- Add k-value to only
 * lower_bound of a range. 2- Reduce
 * upper_bound + 1 index by k-value.
 * 
 * After all operations, add all values,
 * check the maximum sum and print
 * maximum sum.
 * 
 * 
 *
 */
public class RangeIncrementalMax {

	static int findMax(int n, int a[], int b[], int k[], int m) {
		int[] arr = new int[n];
		// start performing m operations
		for (int i = 0; i < m; i++) {
			// Store lower and upper index i.e. range
			int lowerbound = a[i];
			int upperbound = b[i];

			// Add 'k[i]' value at this operation to
			// whole range
			for (int j = lowerbound; j <= upperbound; j++)
				arr[j] += k[i];
		}
		// Find maximum value after all operations and
		// return
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
			res = Math.max(res, arr[i]);
		return res;
	}

	public static void main(String[] args) {
		// Number of values
		int n = 5;
		int a[] = { 0, 1, 2 };
		int b[] = { 1, 4, 3 };

		int k[] = { 100, 100, 100 };
		int m = a.length;
		System.out.println(findMax(n, a, b, k, m));
	}
}
