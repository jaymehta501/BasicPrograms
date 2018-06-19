package Arrays;

import java.util.HashMap;

public class findPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPair(new int[] {1, 5, 7, -1, 5},6);
	}

	public static void findPair(int[] arr1, int sum) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int counter = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i])+1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		
		for (int i =0; i <arr1.length; i++) {
			
			if (map.get(sum - arr1[i]) != null) {
				counter = counter + map.get(sum - arr1[i]);
			}
			
			if (sum-arr1[i] == arr1[i])
				counter--;
			}
		
		System.out.println(counter/2);
	}
}
