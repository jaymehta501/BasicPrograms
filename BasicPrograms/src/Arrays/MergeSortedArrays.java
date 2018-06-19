package Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {

		int[] arr1 = {1,1, 2,3,5,7,9};
		int[] arr2 = {2,4,6,8,10,11,12,13};
		
		mergeSortedArrays(arr1, arr2);
		
	}
	
	public static void mergeSortedArrays(int[] arr1, int[] arr2) {
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int[] result = new int[n1+n2];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i<n1 && j<n2) {
			if(arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
			} else {
				result[k] = arr2[j];
				j++;
			}	
			k++;
		}
		
		while (i<n1) {
			result[k] = arr1[i++];
			k++;
		}
		
		while(j<n2) {
			result[k] = arr2[j++];
			k++;
		}
		
		for (int p = 0; p < result.length; p++) {
			System.out.print(result[p] + ",");
		}
		
	}

}
