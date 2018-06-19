package Arrays;

import java.util.HashMap;

public class FindElementsAppearsNKTimesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrNumbers = new int[]{1,1,1,1,2,2,2,2,4,4,5,5,6,7,7,7,7,7,7,8,8,8,8,9,9,10,10,101};
		
		FindElementsAppearsNKTimesInArray arr = new FindElementsAppearsNKTimesInArray();
		arr.findAllElements(arrNumbers, 7);
	}
	
	public void findAllElements(int[] numbers, int k){
		
		int len = numbers.length;
		int nbyk = len/k;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i =0; i< numbers.length; i++){
			
			if (map.containsKey(numbers[i])){
				
				map.put(numbers[i], map.get(numbers[i])+1);
				
			}else{
				
				map.put(numbers[i], 1);
			}
			
		}
	
		System.out.println(nbyk);
		
		for (int i=0; i<numbers.length; i++){
			
			if(map.containsKey(numbers[i]) && map.get(numbers[i]) >= nbyk){
				
				System.out.println(numbers[i]);
				map.remove(numbers[i]);
			}
		}
	}

}
