/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
*/

package Patterns;

import java.util.Scanner;

public class Pattern9 {

public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i = 1; i<= rowNo; i++){
			
			for(int j =1; j<=i ; j++){
				
			System.out.print(j + " ");
			
			}
			
			for(int k=i-1; k>=1; k--){
				
				System.out.print(k + " ");
			}
			
			System.out.println();
		}

}
	
	
}
