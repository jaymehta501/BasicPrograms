package Practice;

import java.util.*;

public class FindDigits {

	public FindDigits() {
		// TODO Auto-generated constructor stub
	}

    public static void main(String[] args) {
    	
    	Scanner scannerObject = new Scanner(System.in);
    	int number,n,digits;
    	int count = 0;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.print("Enter a number: ");
        number = scannerObject.nextInt();
        
//        imp find length of int
        digits = (int) Math.log10(number) + 1;
        
        System.out.println("Length of a number is: "+digits);
        for(n=0;n<digits;n++) {
        	int z;
        	z = number % 10;
            System.out.println("value of z is: "+z);
            if(z == 0)
            {
            	System.out.println("division by zero is undefined");
            	System.out.println("ignoring");
            }
            else if ((number%z) == 0 ) {
            	System.out.println(number+" is divisible by "+z);
				count++;
			}
            number=number/10;
        	System.out.println("New number is: "+number);
        }
        System.out.println("Our count of evenly divisible digits is: "+count);
    }
}