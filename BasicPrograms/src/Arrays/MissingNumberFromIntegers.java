package Arrays;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberFromIntegers {

	/**
	 * This method will work if more than one missing numbers
	 */
	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}

	/**
	 * This will work if only one number is missing
	 * 
	 * @param numbers
	 * @param totalCount
	 * @return
	 */
	private static int getSum(int[] numbers, int totalCount) {
		int expectedSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;
		for (int i : numbers) {
			actualSum = actualSum + 1;
		}
		return expectedSum - actualSum;
	}

	public static void main(String[] args) {

		// one missing number
		printMissingNumber(new int[] { 1, 2, 3, 4, 6 }, 6);

		printMissingNumber(new int[] { 1, 2, 3, 4, 6, 7, 8, 10 }, 10);

	}

}
