package Arrays;

import java.util.Arrays;

//Time Complexity O(NlogN) IF Array is very large No Auxilary Space
/**
 * A more efficient in-place solution
 * would be to sort the array and use
 * two pointers to scan through array
 * from both direction i.e. beginning
 * and end. If sum of both the values
 * are equal to given number then we
 * output the pair and advance them. If
 * the sum of two numbers is less than k
 * then we increase the left pointer,
 * else if the sum is greater than k we
 * decrement the right pointer, until
 * both pointers meet at some part of
 * the array. The complexity of this
 * solution would be O(NlogN) due to
 * sorting.
 * 
 * 
 *
 */
public class PairSumWithQuickSort {
	static void findThePairs(int inputArray[], int inputNumber) {
		//Sorting the given array

		Arrays.sort(inputArray);

		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");

		//Initializing i to first index

		int i = 0;

		//Initializing j to last index

		int j = inputArray.length - 1;

		//Till i crosses j, perform the following task

		while (i < j) {
			//If inputArray[i]+inputArray[j] is equal to inputNumber

			if (inputArray[i] + inputArray[j] == inputNumber) {
				//then Print inputArray[i] and inputArray[j]

				System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);

				//Increment i

				i++;

				//Decrement j

				j--;
			}

			//If inputArray[i]+inputArray[j] is smaller than inputNumber

			else if (inputArray[i] + inputArray[j] < inputNumber) {
				//then increment i

				i++;
			}

			//If inputArray[i]+inputArray[j] is greater than inputNumber

			else if (inputArray[i] + inputArray[j] > inputNumber) {
				//then decrement j

				j--;
			}
		}
	}

	public static void main(String[] args) {
		findThePairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);

		findThePairs(new int[] { 4, -5, 9, 11, 25, 13, 12, 8 }, 20);

		findThePairs(new int[] { 12, 13, 10, 15, 8, 40, -15 }, 25);

		findThePairs(new int[] { 12, 23, 10, 41, 15, 38, 27 }, 50);
	}
}
