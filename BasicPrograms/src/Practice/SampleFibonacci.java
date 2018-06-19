package Practice;

import java.util.Scanner;

public class SampleFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Print Number need series till: " );
		Scanner sc = new Scanner(System.in);
		int original = sc.nextInt();
		
		if (original == 0){System.out.println("0");}
		else if (original == 1) {System.out.println("0 1");}
		else {
			for (int i=2; i <= original; i++){
			
				System.out.print(fibonacci(i) + " ");
			
			}
		}
			
		}

	private static long fibonacci(int i) {
		// TODO Auto-generated method stub
		if (i == 0) {
	           return 0;
	       } else if (i == 1) {
	           return 1;
	       } else {
		
		return fibonacci(i-1) + fibonacci(i-2); }
	}

}

