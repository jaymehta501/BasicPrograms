package Arrays;

//O (N)
/**
 * Trick is to keep track of min and max of the subarray ending at i in the
 * array indices 0 to i. While calculating the min or max, we also need to
 * examine max or min respetively
 * 
 * 
 *
 */
public class SubArrayProductPositiveNegative {
	static int product(int A[], int begin, int end) {
		int i, step, mh, ma;

		step = begin > end ? -1 : 1;

		ma = A[begin];
		mh = 1;
		for (i = begin; i != end; i += step) {
			mh *= A[i];
			if (mh > ma)
				ma = mh;
			if (A[i] == 0)
				mh = 1;
		}

		return ma;
	}

	static int max_subarray_product(int A[], int n) {
		int x, y;
		x = product(A, 0, n - 1);
		y = product(A, n - 1, 0);
		return x > y ? x : y;
	}

	public static void main(String[] args) {
		int[] aray = { 2, 3, -2, 4 };
		System.out.println(max_subarray_product(aray, 4));
	}

}
