package Arrays;

public class SmallestPositiveValueCantRepresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findSmallest(new int[] {1,2,3,5,7});
	}

	
	static void findSmallest(int arr[])
	{
		int n = arr.length;
	   int res = 1; // Initialize result
	 
	   // Traverse the array and increment 'res' if arr[i] is
	   // smaller than or equal to 'res'.
	   for (int i = 0; i < n && arr[i] <= res; i++) {
	       res = res + arr[i];
	   }
	   System.out.println( res);
	}
}
