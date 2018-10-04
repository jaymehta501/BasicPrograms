package Arrays;

/**
 * 1) Initialize both first and second
 * smallest as INT_MAX first = second =
 * INT_MAX 2) Loop through all the
 * elements. a) If the current element
 * is smaller than first, then update
 * first and second. b) Else if the
 * current element is smaller than
 * second then update second
 * 
 * 
 *
 */
public class SmallestAndSecondSmallest {

	static void twoSmallest(int[] array) {

		int first;
		int second;
		int length = array.length;

		if (length < 2) {
			System.out.println("Invalid Input");
		}

		first = Integer.MAX_VALUE;
		second = Integer.MAX_VALUE;

		for (int i = 0; i < length; i++) {

			if (array[i] < first) {
				second = first;
				first = array[i];
			} else if (array[i] < second && array[i] != first) {
				second = array[i];
			}

		}

		if (second == Integer.MAX_VALUE)
			System.out.println("There is no second" + "smallest element");
		else
			System.out.println("The smallest element is " + first + " and second Smallest" + " element is " + second);
	}

	/*
	 * Driver program to test above
	 * functions
	 */
	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 1 };
		twoSmallest(arr);
	}
}
