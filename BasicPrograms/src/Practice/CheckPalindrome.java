package Practice;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "Hello";
		String reverse = "";
		
		for (int i = test.length()-1; i >= 0; i--) {
			
			reverse = reverse + test.charAt(i);
		}
		
		System.out.println("Reverse of String given String = " + reverse);
		
		if (test.equals(reverse)) {
			
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}

}
