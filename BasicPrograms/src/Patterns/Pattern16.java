/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777
*/

package Patterns;

import java.util.Scanner;

public class Pattern16 {

public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i = 1; i <= rowNo; i++){
		
			for (int j=1; j <= rowNo-i; j++){
				
				System.out.print(1);
				
			}
			
			for (int j=1; j<=i; j++){
				
				System.out.print(i);
			}
			
		System.out.println();
		
		}
		
		
}		
}