package Arrays;

public class AddTwoArrays {

	static int[] result = new int[5];

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		int[] sumUp = new int[500];
		int l = 0;
		int counter = 0;
		for (int i = 0; i <= array1.length - 1; i++) {
			int sum = array1[i] + array2[i];
			if (sum > 9) {
				int[] rs = AddTwoArrays.digit(sum);
				int[] result = new int[5];
				int k = 0;
				for (int z = rs.length - 1; z >= 0; z--) {
					result[k] = rs[z];
					k++;
				}
				System.out.println(result);
				for (int dd = 0; dd <= result.length - 1; dd++) {
					sumUp[l] = result[dd];
					l++;
				}

			} else {
				sumUp[l] = sum;
				l++;
			}

		}
		counter = 0;
		while (counter < sumUp.length) {
			System.out.println(sumUp[counter]);
			counter++;
		}

	}

	private static int[] digit(int number) {
		int i = 0;
		while (number > 0) {
			int d = number / 10;
			int k = number - d * 10;
			number = d;
			result[i] = k;
			i++;
		}
		return result;
	}
}
