/*
1
10
101
1010
10101
101010
1010101
*/

package Patterns;

import java.util.Scanner;

public class Pattern14 {

public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i = 1; i <= rowNo; i++){
			for(int j=1; j<=i; j++){
				if (j%2 == 0){
					System.out.print("0");
				}
				
				if (j%2 != 0){
					System.out.print("1");	
				}
			}
			System.out.println();
		}
	}		
}