/*
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/

package Patterns;

import java.util.Scanner;

public class Pattern7 {

public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i =rowNo; i>=1; i--){
			
			for (int j=i; j>=1; j--){
				
				System.out.print(j + " ");
			}
			
			System.out.println();
			
		}
		
	}
	
}
