package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;



public class IntegerCountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Arr = new int[]{6,6,6,5,9,8,4,4,8,6,1,4,9,8,1,1,1,1,1,2,2,2,2,4,5,6,6,1,2,3,4,5,6,7,8,9,8,1,3,4};
		
		IntegerCountArray classVariable = new IntegerCountArray();
		classVariable.integerArrayCount(Arr);
	}

	public int integerArrayCount(int[] Arr){
		
		Arrays.sort(Arr);
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		java.util.Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 0; i< Arr.length; i++){
			
			if(map1.containsKey(Arr[i])){
				
				map1.put(Arr[i], map1.get(Arr[i]) + 1);;
				
			}
			
			else{
				
				
				map1.put(Arr[i], 1);
				queue.add(Arr[i]);
			}
		}
		
		
		while(!queue.isEmpty())
		{
			
			int firstUnique = queue.poll();
			System.out.println(firstUnique + "-------->"+map1.get(firstUnique));
			
		}
		
		return 2;
		
		
	}
}
