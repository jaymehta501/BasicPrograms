package Evernote;

import java.util.Arrays;

public class MaxProductArray {

	public static void main(String[] args) {

		int arr[] = {12, 9, 8, 20, 11, -25, -30, -35, -4, 10, 35, 40, -50, 60};
		
		Arrays.sort(arr);
		int len = arr.length;
		
		if (arr[0] >= 0) {
			
			System.out.println(arr[len-1] * arr [len-2]);
		} else {
			
			if ( (arr[len-1] * arr [len-2]) > (arr[0] * arr [1])) {
				System.out.println(arr[len-1] * arr [len-2]);
			} else {
				System.out.println(arr[0] * arr [1]);
			}
			
		}
		

	}

}
