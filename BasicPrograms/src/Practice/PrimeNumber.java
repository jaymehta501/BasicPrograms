package Practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPrime(127);
	}
	
	public static void isPrime (int number){
		
		boolean result = false;
		int sqrt = (int) (Math.sqrt(number) + 1);
		
		if (number ==2 || number == 3){
			
			result = true;
		}
		
		else if (number % 2 == 0) {
			
			result = false;
			
		}
		
		else {
			
			for (int i =3; i <= sqrt; i = i+2){
				
				if (number % i == 0){
					
					result = false;
					break;
					
				}else {
					
					result = true;
				}
			}
			
		}		
		
		System.out.println("Result of Given Number: " + result);
	}

}
