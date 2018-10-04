package Arrays;

public class CountEvenSumSubArrays {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 2, 3, 4, 1 };
		int[] arr1 = { 4, 5, 0, -2, -3, 1 };
		int k = 2;
		System.out.println(evenSumSubArrays(arr, k));
		System.out.println(countEvenSumSubArrays(arr1, 5));
	}

	// This is efficient answer
	// O(n+k)
	//Space O(k)
	// sum(i,j) = (q1 - q2)k + rem1-rem2  where q is quotient and rem is remainder
	/**
	 * Algo
	 * Calculate cumSum in loop and get mod count for all remainder in auxilary(Mod Array)
	 * traverse mod array and apply below formula
	 * result = result + (mod[i]*(mod[i]-1))/2
	 * @param arr
	 * @param k
	 * @return
	 */
	public static int countEvenSumSubArrays(int arr[], int k) {
		int mod[] = new int[k];
		int n = arr.length;
		System.out.println(Math.abs(-2));
		// Traverse original array and compute cumulative
		// sum take remainder of this current cumulative
		// sum and increase count by 1 for this remainder
		// in mod[] array
		int cumSum = 0;
		for (int i = 0; i < n; i++) {
			cumSum += arr[i];
			// Hold count of each remainder
			mod[Math.abs(cumSum)%k]++;
		}
		int result = 0;
		// Traverse mod[]
		for (int i = 0; i < k; i++)

			// If there are more than one prefix subarrays
			// with a particular mod value.
			if (mod[i] > 1)
				result += (mod[i] * (mod[i] - 1)) / 2;

		// add the elements which are divisible by k itself 
		// i.e., the elements whose sum = 0
		result += mod[0];
		return result;
	}

	// Some test cases are passed on hacker rank
	public static int evenSumSubArrays(int arr[], int k) {
		int count = 0, s = 0;
		for (int i = 0; i < arr.length; i++) {
			s = 0;
			for (int j = i; j < arr.length; j++) {
				s = s + arr[j];
				if ((s % k) == 0) {
					System.out.println("Value of S " + s);
					count++;
				}

			}
		}
		System.out.println("Num of Sub-Array " + count);
		return count;
	}

}
