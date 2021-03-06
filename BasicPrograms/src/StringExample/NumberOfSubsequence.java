package StringExample;

// Time Complexity : O(n)
public class NumberOfSubsequence {

	static int countSubsequences(String s) {

		// Initialize counts of different subsequences
		// caused by different combination of 'a'
		int aCount = 0;

		// Initialize counts of different subsequences
		// caused by different combination of 'a' and
		// different combination of 'b'
		int bCount = 0;

		// Initialize counts of different subsequences
		// caused by different combination of 'a', 'b'
		// and 'c'.
		int cCount = 0;
		for (int i = 0; i < s.length(); i++) {
			/* If current character is 'a', then
	           there are following possibilities :
	             a) Current character begins a new
	                subsequence.
	             b) Current character is part of aCount
	                subsequences.
	             c) Current character is not part of
	                aCount subsequences. */
			if (s.charAt(i) == 'a') {
				aCount = (1 + 2 * aCount);
			} else if (s.charAt(i) == 'b') {
				/* If current character is 'b', then
		           there are following possibilities :
		             a) Current character begins a new
		                subsequence of b's with aCount
		                subsequences.
		             b) Current character is part of bCount
		                subsequences.
		             c) Current character is not part of
		                bCount subsequences. */
				bCount = (aCount + 2 * bCount);
			} else if (s.charAt(i) == 'c') {
				 /* If current character is 'c', then
		           there are following possibilities :
		             a) Current character begins a new
		                subsequence of c's with bCount
		                subsequences.
		             b) Current character is part of cCount
		                subsequences.
		             c) Current character is not part of
		                cCount subsequences. */
				cCount = (bCount + 2 * cCount);
			}

		}
		return cCount;
	}

	public static void main(String[] args) {
		String s = "abbc";
		System.out.println(countSubsequences(s));

	}
}
