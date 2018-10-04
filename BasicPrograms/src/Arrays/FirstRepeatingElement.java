package Arrays;

import java.util.HashSet;

public class FirstRepeatingElement {

	// This function prints the first repeating element in arr[]
	static void printFirstRepeating(int arr[]) {
		// Initialize index of first repeating element
		int min = -1;

		// Creates an empty hashset
		HashSet<Integer> set = new HashSet();

		// Traverse the input array from right to left
		for (int i = arr.length - 1; i >= 0; i--) {
			// If element is already in hash set, update min
			if (set.contains(arr[i]))
				min = i;

			else // Else add element to hash set
				set.add(arr[i]);
		}

		// Print the result
		if (min != -1)
			System.out.println("The first repeating element is " + arr[min]);
		else
			System.out.println("There are no repeating elements");
	}

	public static void main(String[] args) {
		// Driver method to test above method

		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		printFirstRepeating(arr);

	}

}
