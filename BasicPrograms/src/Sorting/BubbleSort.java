package Sorting;

import Misc.ScanNumbers;

/**
 * Time Complexity of this is Best Case :: O(n) his time complexity can occur if
 * the array is already sorted, and that means that no swap occurred and only 1
 * iteration of n elements Worst Case :: O(n^2) If array is sorted in descending
 * Average Case :: O(n^2) order Space Complexity :: O(1)
 * 
 * OR
 * 
 * Given an array of length N and an integer K, sort the array as much as
 * possible such that no element travels more than k positions to its left - an
 * element however can travel as much as it likes to its right. Answer : The
 * outer loop will run for K times. So only the smallest integer would be
 * shifted a maximum of k times to the left.
 * 
 * 
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort bubblersort = new BubbleSort();
		/**
		 * Scan Input from Console
		 */
		int[] scannedArray = ScanNumbers.getScannedNumbersArray();
		System.out.println(scannedArray.length);
		/**
		 * Implement Bubble Sort
		 */
		ScanNumbers.printArray(bubblersort.bubbleSort(scannedArray), "Sorted with Bubble Sort");
	}

	private int[] bubbleSort(int[] array) {
		int n = array.length - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}
		return array;
	}

}
