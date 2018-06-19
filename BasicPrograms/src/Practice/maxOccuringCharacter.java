package Practice;

// @author Jay Mehta
// Method that takes a String as an input parameter, and returns the character that occurs most often within the input String.

public class maxOccuringCharacter {
	
	public static char getMaxOccuringChar(String usrString) {
		
		if (usrString.isEmpty() || usrString == null) {
	        throw new IllegalArgumentException("input word must have non-empty value.");
	    }
		
		final int ASCII_SIZE = 128;
		int charCounter[] = new int[ASCII_SIZE];
		int maximum = -1;
		char maxOccuringCharacter = ' ';
	
		for (int i=0; i<usrString.length(); i++) {
			charCounter[usrString.charAt(i)]++;
		}
	
		for (int i = 0; i<usrString.length(); i++) {
			if (maximum < charCounter[usrString.charAt(i)]) {
				maximum = charCounter[usrString.charAt(i)];
				maxOccuringCharacter = usrString.charAt(i);
			}
		}
	
		return maxOccuringCharacter;
	}
	
	public static void main(String[] args)
	{
		String str = "Good Morning!";
		System.out.println("Max occurring character is " +
							getMaxOccuringChar(str));
	}
}

