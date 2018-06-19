package Practice;

import java.util.Scanner;

public class FindPairSum {
	
	public static void main(String[] args){
		
		int[] positiveNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		System.out.println("Please Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int usrNum = sc.nextInt();
		
		FindPairs(positiveNumbers, usrNum);
	}

	public static void FindPairs(int[] positiveNums, int usrNum) {

		for (int i = 0; i < positiveNums.length; i++) {
			for (int j = i + 1; j < positiveNums.length; j++) {

				if (positiveNums[i] + positiveNums[j] == usrNum) {

					System.out.println("Pair available in given Array: "
							+ positiveNums[i] + " and " + positiveNums[j]);
				}
			}
		}

	}
	
	
}
