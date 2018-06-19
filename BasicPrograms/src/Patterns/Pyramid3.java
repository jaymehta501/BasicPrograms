/*
         *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * *
 * * * * * * * * *
 */

package Patterns;

import java.util.Scanner;

public class Pyramid3 {

	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("How Many Rows You Want In Your Pyramid?");
	        int noOfRows = sc.nextInt();

	 
	        System.out.println("Here Is Your Pyramid");
	 
	        for(int i=noOfRows; i>=1; i--){
	        	for(int j=1; j<i; j++){
	        		
	        		System.out.print(" ");
	        	}
	        	
	        	for(int k=i; k<=noOfRows; k++){
	        		
	        		System.out.print("*"+ " ");

	        	}
	
	       	 System.out.println();
	        }

	    }
	
}
