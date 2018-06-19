/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
*/

package Patterns;

import java.util.Scanner;

public class leftPyramidSameDigits {

public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i =1; i<=rowNo; i++){
			
			for (int j=1; j<=i; j++){
				
				System.out.print(i + " ");
			}
			
			System.out.println();
			
		}
		
	}
	
}
