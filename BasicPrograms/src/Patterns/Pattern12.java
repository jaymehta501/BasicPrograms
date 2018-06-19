/*
******
*****
****
***
**
*
**
***
****
*****
******
*/

package Patterns;

import java.util.Scanner;

public class Pattern12 {

public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i = rowNo; i >= 1; i--){
			
			for(int j =1; j<=i ; j++){
				
			System.out.print("*" + " ");
			
				}
			
			System.out.println();
	
		}
		
		for (int i = 2; i <= rowNo; i++){
			
			for(int j =1; j<=i ; j++){
				
			System.out.print("*" + " ");
			
				}
			
			System.out.println();
	
		}

	}
		
}