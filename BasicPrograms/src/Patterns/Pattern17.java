/*
0000000
0100000
0020000
0003000
0000400
0000050
0000006
*/

package Patterns;

import java.util.Scanner;

public class Pattern17 {

public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i = 1; i <= rowNo; i++){	
			for (int j=1; j <= rowNo; j++){
				if (i==j){
					System.out.print(i);
				}
				
				else{
				System.out.print(0);
				}
		
		}
			System.out.println();
		}
}		
}