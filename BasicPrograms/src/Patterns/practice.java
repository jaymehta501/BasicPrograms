package Patterns;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		System.out.println("Enter total lines: ");
		
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		
		int rowcount =1;
		
		for (int i = lines; i >= 1; i--) {
			
			for (int j = 0; j < i; j++){
				
				System.out.print(" ");
				
			}

			for (int k = i; k <= lines ; k++){
				
				System.out.print(rowcount + " ");
			}
			
			rowcount = rowcount +1;
			System.out.println();
		}
		
	}
	
	
}
