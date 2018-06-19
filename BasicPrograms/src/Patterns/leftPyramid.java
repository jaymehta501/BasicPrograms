/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
*/

package Patterns;

import java.util.Scanner;

public class leftPyramid {

	public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i =1; i<=rowNo; i++){
			
			for (int j=1; j<=i; j++){
				
				System.out.print(j + " ");
			}
			System.out.println();
			
		}
		
	}
	
}



