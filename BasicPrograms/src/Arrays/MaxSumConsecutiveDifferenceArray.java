package Arrays;

import java.util.Arrays;

/**
 * 
 * Time Complexity: O(nlogn). Auxiliary
 * Space : O(1)
 * 
 * The idea is to use Greedy Approach
 * and try to bring elements having
 * greater difference closer. Sort with
 * 
 * Quick Sort a1 < a2 < a3…. < an – 1 <
 * an.
 * 
 * 
 * Arrange Elements a1, an, a2, an-1,….,
 * an/2, a(n/2) + 1
 * 
 * We can observe that the arrangement
 * produces the optimal answer, as all
 * a1, a2, a3,….., a(n/2)-1, an/2 are
 * subtracted twice while a(n/2)+1,
 * a(n/2)+2, a(n/2)+3,….., an – 1, an
 * are added twice.
 * 
 * 
 *
 */
public class MaxSumConsecutiveDifferenceArray {

	// consecutive elements.
	static int maxSum(int arr[], int n) {
		int sum = 0;

		// Quick Sort
		Arrays.sort(arr);

		// Subtracting a1, a2, a3,....., a(n/2)-1, an/2
		// twice and adding a(n/2)+1, a(n/2)+2, a(n/2)+3,.
		// ...., an - 1, an twice.
		for (int i = 0; i < n / 2; i++) {
			sum -= (2 * arr[i]);
			sum += (2 * arr[n - i - 1]);
		}

		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 1, 8 };
		int n = arr.length;
		System.out.println(maxSum(arr, n));
	}
}
