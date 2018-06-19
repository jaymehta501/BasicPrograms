package Practice;

public class FindMaxNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 6,7,8,9,10,4,5 };

		findMaxNum(arr);

	}

	public static void findMaxNum(int[] usrArr) {

		int pointer1 = 0;
		int pointer2 = usrArr.length - 1;

		if (usrArr[pointer1] < usrArr[pointer2]) {
			System.out.println("Min Number is: " + usrArr[pointer1]);
		} else {
			while (pointer1 < pointer2) {
				if (usrArr[pointer1] < usrArr[pointer2]) {
					pointer1++;
				} else {
					pointer2--;
				}
				
			}
			System.out.println(usrArr[pointer2+1]);
		}

	}
}
