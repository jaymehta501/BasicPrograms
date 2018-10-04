package Arrays;

// O(n)
//O(1)
//An efficient solution to traverse array from right,keep track of counts of 1 s from right.Whenever we see a 0,we increment the result by count of 1 s.

public class PassingCars {
	// Returns count of passing cars
	static int getPassingCars(int A[], int n) {
		// Initialize count of 1s from right
		// and result
		int countOne = 0, result = 0;
		while (n >= 1) {
			if (A[n - 1] == 1)
				countOne++;
			else
				result += countOne;
			n--;
		}

		return result;
	}

	// Driver program
	public static void main(String[] args) {
		int A[] = { 0, 1, 0, 1, 1 };
		int n = A.length;
		System.out.println(getPassingCars(A, n));
	}
}
