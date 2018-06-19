package Arrays;

public class LargestAndSmallestNumberFromArray {

	public static void main(String[] args) {
		
		LargestAndSmallestNumberFromArray obj = new LargestAndSmallestNumberFromArray();
		
		int[] intArr = new int[]{21, 22, 45, 87, 99, 89, 8, 999, 888, 777, 656, 453, 9090, 2};
		obj.findLargestAndSmallest(intArr);	
	}
	
	public void findLargestAndSmallest(int[] numbers){
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for (int i =0; i < numbers.length; i++){
			
			if (numbers[i] > largest) {
				
				largest = numbers[i];
				
			} else if (numbers[i] < smallest ){
				
				smallest = numbers[i];
			}		
		}
		System.out.println("Largest number from Array is : " + largest);
		System.out.println("Smallest number from Array is : " + smallest);	
	}
}
