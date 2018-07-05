package Arrays;

import java.util.Stack;

public class Largest5Numbers {

	public static void main(String args[]) {
		
	    int i;
	    int large[] = new int[5];
	    int[] array = new int[] { 1010, 1, 1111, 929, 656, 768, 1234, 432, 123, 768, 1111, 20 };
	  //  int array[] = { 33, 55, 13, 46, 87, 42, 10, 34, 43, 56 };

	    for (int j = 0; j < array.length; j++) {
	        for (i = 4; i >= 0; i--) {
	            if (array[j] > large[i]) {
	                if (i == 4) {
	                    large[i] = array[j];
	                }
	                else{
	                    int temp = large[i];
	                    large[i] = array[j];
	                    large[i+1] = temp;
	                }
	            }
	        }
	    }
	    
	    
	    for (int j = 0; j<5; j++)
	    {
	        System.out.println("Largest "+ j + ":"+ large[j]);
	    }
	    

	}

}
