package Arrays;

import java.util.Arrays;

/**
 * Quick Sort
 * 
 * 
 *
 */
public class EvenOddSortandPlacement {

	public static void twoWaySor(int[] array, int n) {

		int l = 0;
		int r = n - 1;
		// Odd number counter
		int k = 0;

		while (l < r) {
			// find first odd number from left side
			while (array[l] % 2 != 0) {
				l++;
				k++;
			}
			// find first even number from right side
			while (array[r] % 2 == 0) {
				r--;
			}

			// Swap numbers
			if (l < r) {
				int temp = array[l];
				array[l] = array[r];
				array[r] = temp;
			}

		}

		for (Integer in : array) {
			System.out.print(in + " ");
		}
		System.out.println();
		Arrays.sort(Arrays.copyOfRange(array, 1, k));

		Arrays.sort(Arrays.copyOfRange(array, k + 1, n));

		for (Integer in : array) {
			System.out.print(in + " ");
		}

	}

	public static void main(String[] args) {
		int array[] = { 3, 6, 9, 2, 4, 10, 34, 21, 5 };
		int n = array.length;
		twoWaySor(array, n);
	}

}
