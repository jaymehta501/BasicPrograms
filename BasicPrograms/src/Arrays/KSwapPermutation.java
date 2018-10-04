package Arrays;

/**
 * An Efficient approach is to think
 * greedily. If we visualize the problem
 * then we will get to know that largest
 * permutation can only be obtained if
 * it starts with n and continues with
 * n-1, n-2,…. So we just need to put
 * the 1st, 2nd, 3rd, …, kth largest
 * element to their respective position.
 * 
 * 
 * 
 *         Time complexity: O(n)
 *         Auxiliary space: O(n)
 *
 */
public class KSwapPermutation {

	static public void largestPermutation(int[] array, int n, int k, int[] indexArray) {

		for (int i = 0; i < n; i++) {
			indexArray[array[i]] = i;
		}

		for (int i = 0; i < n && k > 0; i++) {
			if (array[i] == n - i) {
				continue;
			}
			array[indexArray[n - i]] = array[i];
			indexArray[array[i]] = indexArray[n - i];
			array[i] = n - i;
			indexArray[n - i] = i;
			k--;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 2, 1, 3 };
		int n = arr.length;
		int k = 3;
		// Auxiliary Array to Store Positions of elements
		int[] indexArray = new int[n + 1];
		largestPermutation(arr, n, k, indexArray);
	}

}
