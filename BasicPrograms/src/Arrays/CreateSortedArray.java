package Arrays;

import java.util.Scanner;

public class CreateSortedArray {

	public static void main(String[] args) {

		createSortedArray();
	}
	
	public static void createSortedArray () {	
		
		int[] sortedArr = {5,6,8,10,12,15,17,20,22,25,28, 29};
		
		int[] sortedArr1 = new int[13];
		
		System.out.println("Please enter number you want to put in sorted array: ");
		Scanner sc = new Scanner(System.in);
		int usrInput = sc.nextInt();
		
		for (int i = 0; i < sortedArr.length -1 ; i++) {
			
			if  (usrInput > sortedArr[i]) {
				
				sortedArr1[i] = sortedArr[i];
			}
			
			else{
				
				for (int j = sortedArr.length -1 ; j >= i; j--) {
					
					sortedArr1[j+1] = sortedArr[j];
				}
				
				sortedArr1[i] = usrInput;
				break;	
			}

		}
		
		for (int p = 0; p < sortedArr1.length ; p++) {
			System.out.print(" " + sortedArr1[p]+ " ");
		}
		System.out.println();
		
		}		
}
