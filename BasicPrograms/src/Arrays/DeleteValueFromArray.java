package Arrays;

import java.util.Scanner;

public class DeleteValueFromArray {

	public static void main(String[] args) {

		deleteValueFromArray();
	}
	
	public static void deleteValueFromArray (){
		
		int[] array = {2,3,4,4,1,1,1,1,1,1,3,5,5,6,7,8,9,1,2,11,23,21,11};
		System.out.println("Please enter number you want to delete from array: ");
		Scanner sc = new Scanner(System.in);
		int usrInput = sc.nextInt();
		int counter = 0;
		
		for (int i = 0 ; i < array.length - 1 ; i++) {
			
			if (usrInput == array[i]) {
				counter++;				
				for (int j = i; j < array.length - 1; j++) {
					
					array[j] = array[j+1];
				}
				i=0;
			}
		}
		
		if (counter > 0 ) {
		
		for (int p = array.length-1 ; counter > 0 ; p--, counter--) {
			array[p] = 0;
		} 
	}
		
		for (int p = 0; p < array.length ; p++) {
			System.out.print(" " + array[p]+ " ");
		}
		System.out.println();	
	}	
}