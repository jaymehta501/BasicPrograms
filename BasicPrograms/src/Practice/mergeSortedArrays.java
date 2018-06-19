package Practice;

public class mergeSortedArrays {

	public static void main(String[] args) {

		int[] arr1 = {1,1, 2,3,5,7,9};
		int[] arr2 = {2,4,6,8,10,11,12,13};
		
		mergeSortedArrays1(arr1, arr2);
		
	}
	
	public static void mergeSortedArrays1(int[] arr1, int[] arr2) {
	
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int[] arr3 = new int[n1+n2];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < n1 && j < n2) {
			
			if (arr1[i] < arr2[j]) {
				
				arr3[k] = arr1[i];
				i++;
			} else {
				arr3[k] = arr2[j];
				j++;
			}
			
			k++;			
		}
		
		while (i < n1) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		
		for (int p = 0; p < arr3.length; p++) {
			System.out.print(arr3[p] + "*");
		}
	}

}
