package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CheckDuplicatesInArray {

	public static void main(String[] args) {
		
		Integer[] numbers = new Integer[]{10,10,11,12,13,14,15,14, 19, 20, 21, 19, 22, 25,28};
	
		CheckDuplicatesInArray obj = new CheckDuplicatesInArray();
		obj.bruteForce(numbers);
		obj.byUsingSet(numbers);
		System.out.println("********************");
		obj.byAddingElementsToSet(numbers);
	}
	
	public void bruteForce(Integer[] numbers){
		
		for (int i =0; i < numbers.length; i++){
			
			for (int j= 0; j < numbers.length; j++){
				
				if (numbers[i] ==numbers[j] && i != j){
					
					System.out.println("Duplicate integer is present : " + numbers[i]);
				}
			}
			
		}
			
	}
	
	public void byUsingSet(Integer[] numbers){
		
		List<Integer> arrlst =  Arrays.asList(numbers);
		System.out.println(arrlst.size());
        Set newSet = new HashSet(arrlst);

		System.out.println(numbers.length + "---------"+arrlst.size() +"%%%%%%%%%" + newSet.size());
		
		if (arrlst.size() > newSet.size()){
			
			System.out.println("Array contains duplicates.");
		} else {
			
			System.out.println("Array doesnot contain any duplicates.");
		} 
		
	}
	
	
	public void byAddingElementsToSet(Integer[] numbers){
		
		Set<Integer> newSet = new HashSet<Integer>();
		
		for (int i=0; i<numbers.length; i++){
			
			if(!newSet.add(numbers[i])){
				
				System.out.println(numbers[i]);
			}
		}
	}
	
	
}
