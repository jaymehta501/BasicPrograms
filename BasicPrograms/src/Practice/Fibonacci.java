package Practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String [] args){
		
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.print("Enter a number to print a series till: ");
		int original = scannerObject.nextInt();
		int fib[]= new int[original];
		fib[0] = 0;
        fib[1] = 1;
		for(int i=2;i<original;i++){
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.println("With Array:");
		for(int i=0;i<original;i++) {
			System.out.print(fib[i] + " ");
		}
		System.out.println();
		System.out.println("With function:");
		fibonacci(original);
		System.out.println();
		System.out.println("With recurssion:");
		for (int i = 0; i < original; i++) {
	           System.out.print(fibonacciRecursion(i) + " ");
	       }
	}
	
	public static void fibonacci(int n) {
		if (n == 0) {
	           System.out.println("0");
	       } else if (n == 1) {
	           System.out.println("0 1");
	       } else {
	           System.out.print("0 1 ");
	           int a = 0;
	           int b = 1;
	           for (int i = 2; i < n; i++) {
	               int nextNumber = a + b;
	               System.out.print(nextNumber + " ");
	               a = b;
	               b = nextNumber;
	           }
	       }		
	   }
	
	public static int fibonacciRecursion(int n) {
		if (n == 0) {
	           return 0;
	       } else if (n == 1) {
	           return 1;
	       } else {
	           return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
	       }
	}
}
