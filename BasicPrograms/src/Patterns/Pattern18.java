/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/

package Patterns;

import java.util.Scanner;

public class Pattern18 {

public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i = 1; i <= rowNo; i++){	
			int num = i;
			for (int j=1; j <= i; j++){
				
				System.out.print(num + " ");
				num = num+rowNo-j;
		
		}
			System.out.println();
		}
}		
}