/*
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1
*/

package Patterns;

import java.util.Scanner;

public class Pattern6 {

public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i =rowNo; i>=1; i--){
			
			for (int j=rowNo; j>=i; j--){
				
				System.out.print(j + " ");
			}
			
			System.out.println();
			
		}
		
	}
	
}
