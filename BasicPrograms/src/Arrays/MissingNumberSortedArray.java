package Arrays;

public class MissingNumberSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,5,6,7,9};
		
		findMissingNumbers(arr1);
	}

	
	public static void findMissingNumbers(int[] arr1) {
		
		for (int i = 1; i < arr1.length; i++) {
			
			if (arr1[i - 1] + 1 == arr1[i]) {
				
			} else {
				
				System.out.println(arr1[i - 1] + 1);
			}
			
		}
		
	}
}
