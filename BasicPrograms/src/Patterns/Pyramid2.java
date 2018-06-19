/*
         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
 */

package Patterns;

import java.util.Scanner;

public class Pyramid2 {

	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("How Many Rows You Want In Your Pyramid?");
	        int noOfRows = sc.nextInt();

	 
	        System.out.println("Here Is Your Pyramid");
	 
	        for(int i=noOfRows; i>=1; i--){
	         int rowCount = 1;
	        	for(int j=1; j<i; j++){
	        		
	        		System.out.print(" ");
	        	}
	        	
	        	for(int k=i; k<=noOfRows; k++){
	        		
	        		System.out.print(rowCount+ " ");
	        		rowCount = rowCount + 1;
	        	}
	
	       	 System.out.println();
	        }

	    }
	
}
