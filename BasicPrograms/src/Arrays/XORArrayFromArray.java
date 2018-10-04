package Arrays;

/**
 * Time complexity for this approach is
 * O (n).
 * 
 * 
 *
 */
public class XORArrayFromArray {

	public static int[] createArrayfromXOR(int[] arrayA) {

		int xor = 0;
		int n = arrayA.length;

		for (int i = 0; i < n; i++) {
			xor = xor ^ arrayA[i];
		}

		for (int i = 0; i < n; i++) {
			arrayA[i] = xor ^ arrayA[i];
		}

		return arrayA;
	}

	public static void main(String[] args) {

		int[] array = { 2, 1, 5, 9 };
		int[] res = createArrayfromXOR(array);

		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
