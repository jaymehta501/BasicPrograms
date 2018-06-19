package Arrays;

public class Intersection {

	public static void main(String[] args) {
		//int arr1[] = new int[4];
		int arr1[] = {1,3,6,10};
		int arr2[] = {2,3,5,6};
		int len1,len2;
		
		len1=arr1.length;
		len2=arr2.length;
		int arr3[] = new int[len1+len2];

		
		for(int i=0;i<len1;i++){
			for(int j=0;j<len2;j++){
				if(arr1[i]==arr2[j]){
					arr3[i] = arr1[i];
				}
			}
		}
		
		System.out.print("{");
		for(int i=0;i<arr3.length;i++){
			if(!(arr3[i]==0))
			System.out.print(" "+arr3[i]+" ");
		}
		System.out.print("}");
	}
}
