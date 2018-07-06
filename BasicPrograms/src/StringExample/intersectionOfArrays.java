package StringExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class intersectionOfArrays {

	public static void main(String[] args) {

		int[] arr1 = {13,7,6,6,6,6,1,1,2,3,4,5,5,6,6,6,7,13};
		int[] arr2 = {1,1,4,6,6,8,9,10,11,12,13};
		
		findinterSections(arr1, arr2);
	}
	
	public static void findinterSections(int[] arr1, int[] arr2) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		//ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<Integer> list = new LinkedList<Integer>();
		
		for (int i=0; i<arr1.length; i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i])+1);
			} else {
				map.put(arr1[i], 1);
			}
			
		}
		
		for (int k=0; k <arr2.length; k++) {
			
			if(map.containsKey(arr2[k])) {
				
				if(map.get(arr2[k])>1) {
					
					map.put(arr2[k], map.get(arr2[k])-1);
				}
				list.add(arr2[k]);
				
			} else {
				map.remove(arr2[k]);
			}
		
		}
		
		System.out.println("Intersection : " + list);
		
	}

}