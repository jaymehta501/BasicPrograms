package Arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RepeatedNumbersInArray {

	public static void main(String[] args) {
		
		findRepeatedNumbers(new int[] {1,1,1,1,2,2,2,3,3,4,4,4,4,4,10,10,101,10});
	}
	
	
	public static void findRepeatedNumbers(int[] arr1) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 0; i< arr1.length; i++) {
			
			if(map.containsKey(arr1[i])) {
				
				map.put(arr1[i],map.get(arr1[i])+1);
			} else {
				
				map.put(arr1[i], 1);
				queue.add(arr1[i]);
			}
		}
		
		while(!queue.isEmpty()) {
			int p = queue.poll();
			if (map.get(p)>1) {
				System.out.println(p + " -> " + map.get(p));
			}
		}
		
	}


}