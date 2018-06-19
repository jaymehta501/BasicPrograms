package Arrays;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		searchValueFromArray();
	}

public static void searchValueFromArray (){
		
		int[] array = {2,3,4,4,1,1,1,1,1,1,3,5,5,6,7,8,9,1,2,11,23,21,11};
		System.out.println("Please enter number you want to search from array: ");
		Scanner sc = new Scanner(System.in);
		int usrInput = sc.nextInt();
		int counter = 0;
		
		for (int i = 0; i < array.length -1 ; i++) {
			
			if (usrInput == array[i]) {
				System.out.println(usrInput + " is located at place " + i + " in Array.");
				counter++;
			}
		}
		System.out.println("Total times your integer repeated in Array is :" + counter);
	}

}
