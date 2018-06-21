package StringExample;

//Reverse an array without affecting special characters

public class ReverseStringWithoutSpCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseStringWithoutAffectingSpecialChars("A$b#c%D");
	}
	
	public static void reverseStringWithoutAffectingSpecialChars(String usrStr) {
		
		int n = 0;
		int r = usrStr.length()-1;
		
		char[] charArr = usrStr.toCharArray();
		
		while(n<r) {
			
			if(!Character.isAlphabetic(charArr[n]) ) {
				
				n++;
				
			} else if (!Character.isAlphabetic(charArr[r])) {
				
				r--;
				
			} else {
				
				char temp = charArr[n];
				charArr[n] = charArr[r];
				charArr[r] = temp;
				n++;
				r--;				
			}
		}
		
		for (int p = 0; p<charArr.length; p++) {
			System.out.print(charArr[p]);
		}
	  
	}

}