package Arrays;

import java.util.Set;
import java.util.TreeSet;

/**
 * Input : arr1[] = {1, 2} arr2[] = {3,
 * 4} N = 3 Output : 6
 * 
 * 
 * 
 *         Add both Arrays put it into
 *         TreeMap(Log(n) for get put
 *         and remove and retrieve nth
 *         item
 * 
 *         O(mn log (n))
 *
 */
public class NthItemSetFormedBySumOfTwoArrays {

	static int calSum(int[] arr1, int[] arr2, int size1, int size2, int n) {
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				set.add(arr1[i] + arr2[j]);
			}
		}
		int counter = 1;
		int sum = 0;
		for (Integer in : set) {
			if (counter == n) {
				sum = in;
			}
			counter++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2 };
		int arr2[] = { 3, 4 };
		int n = 3;
		System.out.println(calSum(arr1, arr2, arr1.length, arr2.length, n));
	}
}