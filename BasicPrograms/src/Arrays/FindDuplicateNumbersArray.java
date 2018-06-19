package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbersArray {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,2,3,4,5,5,3,2,1,2,10,15,14,14};
		findDuplicate(arr1);
	}
	
	public static void findDuplicate(int[] arr1) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i =0; i < arr1.length; i++) {
			
			if (!set.add(arr1[i])) {	
				System.out.println(arr1[i]);
			}	
		}		
	}
}