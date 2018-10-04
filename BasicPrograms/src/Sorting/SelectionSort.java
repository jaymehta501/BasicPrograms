package Sorting;

/**
 * O(n*n) -> not suitable for large data sets
 * 1. in-place comparison-based algorithm
 * 2. Sorted list on left side
 * 3. unsorted end at right side
 * 4. Pick Smallest element and swap with left most element continues moving unsorted
 *    array boundary by one element to right
 * 
 * 
 * 
 *
 */
public class SelectionSort {
	public static int[] doSelectionSort(int[] x) {
		for (int i = 0; i < x.length - 1; i++) {
			int minIndex = i; // Index of smallest remaining value.
			for (int j = i + 1; j < x.length; j++) {
				if (x[minIndex] > x[j]) {
					minIndex = j; // Remember index of new minimum
				}
			}
			if (minIndex != i) {
				//...  Exchange current element with smallest remaining.
				int temp = x[i];
				x[i] = x[minIndex];
				x[minIndex] = temp;
			}
		}
		return x;
	}

	public static void main(String a[]) {

		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		int[] arr2 = doSelectionSort(arr1);
		for (int i : arr2) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

}
