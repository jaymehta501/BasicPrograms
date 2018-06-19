package Practice;

import java.util.Scanner;

public class IntuItTest {
    public static void main(String[] args){
    	
    	while (true) {
    	int oddNumber; 
    	Scanner scInt = new Scanner(System.in);
    	System.out.println("Please enter valid Odd Number : ");
    	oddNumber = scInt.nextInt();
    	
    	if(oddNumber<0){
			System.out.println("Please enter valid Odd Number");
		}
		else if(oddNumber%2!=0 ){
			output(oddNumber);
		}
		else
		{
			System.out.println("Please enter valid Odd Number");
    	
		}
    }
   }
    
    public static void output(int oddNumber){
        for(int i=1;i<=oddNumber;i++)
        {
        for(int j=1;j<=oddNumber;j++)
        {
        if( i==j|| (j==(oddNumber+1-i)))System.out.print("X");
        else
        System.out.print("0");
        }
        System.out.println();
        } 
    }
}
