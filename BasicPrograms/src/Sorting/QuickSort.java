package Sorting;

/**
 * best Case O(nlogn) worst case(o(n*n)
 * Avg case O(nlogn)
 * 
 * 
 * 
 *         Pick Pivot recursivly sort
 *         elements and put element less
 *         than pivot on left side and
 *         greater on right side of
 *         pivot
 * 
 */
public class QuickSort {

	private int[] array;

	public static void main(String a[]) {

		QuickSort sorter = new QuickSort();
		int[] input = { 5, 4, 33, 25, 3, 2, 1 };
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	private void sort(int[] input) {
		if (null != input && input.length <= 0) {
			return;
		}
		this.array = input;
		this.quickSort(0, array.length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[(lowerIndex + (higherIndex - lowerIndex) / 2)];

		while (i <= j) {

			while (array[i] < pivot) {
				i++;
			}

			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (i < higherIndex)
			quickSort(i, higherIndex);
		if (j > lowerIndex)
			quickSort(lowerIndex, j);

	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
