package Practice;

import java.util.ArrayList;
import java.util.List;

public class findSumPairs {

	public static void main(String[] args) {


		int[] arr = {1,2,3,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int sum = 20;
		List<Integer[][]> lst2 = findPair(arr,sum);
		
		for(int i =0; i < lst2.size(); i++) {
			
			System.out.println(lst2.get(i));
		}

	}
	
	public static List<Integer[][]> findPair(int[] arr1, int sum){
		
		List<Integer[][]> lst = new ArrayList<Integer[][]>();
		Integer[][] usrArr = new Integer[1][];
		
		for (int i = 0 ; i < arr1.length; i++) {
			for(int j = i+1; j < arr1.length; j++) {
				
					if(arr1[i]+arr1[j] == sum) {
						usrArr[0][0] = arr1[i];
						usrArr[0][1] = arr1[j];
						lst.add(usrArr);
					}
			}
			
		}		
		
		return lst;		
	}

}