package StringExample;

//Java program to check whether one string is rotation of another string.

public class CheckStringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "HelloWorld!";
		String str2 = "World!Hello";
		
		if (str1.length() == str2.length()) {
			String temp = str1 + str1;
			
			if(temp.contains(str2)) {
				System.out.println("one string is rotation of another string.");
			} else {
				System.out.println("False");
			}
			
		}
		
	}

}
