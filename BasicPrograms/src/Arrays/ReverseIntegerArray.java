package Arrays;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Arr = {9,8,7,6,5,4,3,2};
		
		reverseIntArray(Arr);
		
	}

	public static int[] reverseIntArray (int[] Arr) {
		
		int i = 0;
		int j = Arr.length-1;
		
		for (i = 0 ; i < j /2; i++, j--) {
			
			int temp = Arr[i];
			Arr[i] = Arr[j];
			Arr[j] = temp;
			
		}		
		
		for(int p=0 ; p < Arr.length; p++) {
			
			System.out.print(Arr[p]+",");
		}
		
		return Arr;
	}
	
}
