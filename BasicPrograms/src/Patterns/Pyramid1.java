/*
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
 */

package Patterns;

import java.util.Scanner;

public class Pyramid1 {

	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("How Many Rows You Want In Your Pyramid?");
	        int noOfRows = sc.nextInt();

	        int rowCount = 1;
	 
	        System.out.println("Here Is Your Pyramid");
	 
	        for(int i=noOfRows; i>=1; i--){
	        	for(int j=1; j<i; j++){
	        		
	        		System.out.print(" ");
	        	}
	        	
	        	for(int k=i; k<=noOfRows; k++){
	        		
	        		System.out.print(rowCount+ " ");
	        		
	        	}
	        rowCount = rowCount + 1;
	       	 System.out.println();
	        }

	    }
	
}
