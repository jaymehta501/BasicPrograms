/*
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
*/

package Patterns;

import java.util.Scanner;

public class Pattern11 {

public static void main(String[] args){
		
		System.out.println("Enter row numbers: ");
		
		int rowNo;
		Scanner sc = new Scanner(System.in);
		rowNo = sc.nextInt();
		
		for (int i = 1; i <= rowNo; i++){
			
			for(int j =1; j<i ; j++){
				
			System.out.print(" ");
			
			}
			
			for(int j =i; j<= rowNo; j++){
				
				System.out.print(j);
				
			}
			
			System.out.println();
	
		}
		
		 for (int i = rowNo-1; i >= 1; i--) 
	        {
	            //Printing i spaces at the beginning of each row
	             
	            for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	             
	            //Printing i to rows value at the end of each row
	             
	            for (int j = i; j <= rowNo; j++)
	            {
	                System.out.print(j);
	            }
	             
	            System.out.println();
	        }
			
			System.out.println();
	
		}
}