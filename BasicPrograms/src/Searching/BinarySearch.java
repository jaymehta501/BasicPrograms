package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String args[]) {
		int c, n, search, array[];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = in.nextInt();
		array = new int[n];

		System.out.println("Enter " + n + " integers");

		for (c = 0; c < n; c++)
			array[c] = in.nextInt();

		System.out.println("Enter value to find");
		search = in.nextInt();

		int elementIndex = DivideAndConquer(n, search, array);
		System.out.println("Found at index :: " + elementIndex);
	}

	private static int DivideAndConquer(int n, int search, int[] array) {
		int first = 0;
		int last = n - 1;
		int middle = (first + last) / 2;
		int foundLocation = 0;

		while (first <= last) {
			if (array[middle] < search)
				first = middle + 1;
			else if (array[middle] == search) {
				return foundLocation = middle + 1;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last)
			foundLocation = 0;
		return foundLocation;
	}
}
