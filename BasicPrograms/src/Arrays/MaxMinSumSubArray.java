package Arrays;

/**
 * An Efficient Solution is based on the
 * fact that sum of a subarray (or
 * window) of size k can be obtained in
 * O(1) time using sum of previous
 * subarray (or window) of size k.
 * Except first subarray of size k, for
 * other subarrays, we compute sum by
 * removing first element of last window
 * and adding last element of current
 * window. O(n)
 * 
 * The changing condition for dynamic
 * programming is
 * "We should ignore the sum of the previous n-1 elements if nth element is greater than the sum."
 * 
 * 
 *
 */
public class MaxMinSumSubArray {

	static int maxSum(int arr[], int n, int k) {

		// n must be greater
		if (n < k) {
			return -1;
		}

		int res = 0;

		for (int i = 0; i < k; i++) {
			res = res + arr[i];
		}

		int currSum = res;
		for (int i = k; i < n; i++) {
			currSum = currSum + arr[i] - arr[i - k];
			res = Math.max(res, currSum);

		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { -2,1,-3,4,-1,2,1,-5,4 };
		//int arrs[] = {3, 5, 1, 2, 3, 4, 1};
		int k = 4;
		int n = arr.length;
		System.out.println(maxSum(arr, n, k));
	}

}
