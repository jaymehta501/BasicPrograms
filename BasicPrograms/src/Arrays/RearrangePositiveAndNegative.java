package Arrays;

public class RearrangePositiveAndNegative {

	public static int[] reaarange(int[] array) {
		int pivot = 0;
		int left = 0;
		int right = array.length - 1;
		/**
		 * Arrange all negative on left and positive on right
		 */
		while (left < right ) {

			while (array[left] < 0 && left < right) {
				left++;
			}
			while (array[right] > 0 && left < right) {
				right--;
			}

			if (left < right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			}
		}
		return array;
	}

	/**
	 * Swap numbers
	 * 
	 * @param array
	 */
	public static void swapElements(int[] array) {
		int left = 1;
		int high = 0;
		int right = array.length - 1;
		while (array[high] < 0) {
			high++;
			right = high;
		}

		while (array[left] < 0 && right < array.length) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left = left + 2;
			right++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print("  " + array[i]);
		}
	}

	public static void main(String[] args) {
		int[] arrA = { 1, 2, -3, -4, -5, 6, -7, -8, 9, 10, -11, -12, -13, 14 };
		swapElements(reaarange(arrA));
	}
}
