package Practice;

import java.util.Scanner;

public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args){

		Scanner scannerObject = new Scanner(System.in);

		System.out.print("Enter a number to print a series till: ");
		int number = scannerObject.nextInt();
		int mult=1;

		for(int i=number;i>0;i--){
			mult=mult*i;
		}
		System.out.println("factorial of a number is: "+mult);
		System.out.println("factorial recurrsion of a number is: "+ factorial(number));

	}
	
	public static int factorial(int n)
	{
	       if(n==1){
	         return 1;
	       }
		return n * factorial(n-1);
	}


}
