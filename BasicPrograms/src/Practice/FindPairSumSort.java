package Practice;

import java.util.Scanner;

public class FindPairSumSort {

	public static void main(String[] args) {

		int[] positiveNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
				14, 15, 16, 17, 18, 19, 20 };

		System.out.println("Please Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int usrNum = sc.nextInt();

		FindPairs(positiveNumbers, usrNum);
	}

	public static void FindPairs(int[] positiveNums, int usrNum) {

		int pointer1 = 0;
		int pointer2 = positiveNums.length - 1;

		while (pointer1 < pointer2) {
			if (positiveNums[pointer1] + positiveNums[pointer2] == usrNum) {
				System.out
						.println("Pair of given number from array: "
								+ positiveNums[pointer1] + " "
								+ positiveNums[pointer2]);
				pointer1++;
				pointer2--;
				
			} else if (positiveNums[pointer1] + positiveNums[pointer2] > usrNum) {
				pointer2 = pointer2 - 1;
			} else {
				pointer1 = pointer1 + 1;
			}
		}
	}

}
