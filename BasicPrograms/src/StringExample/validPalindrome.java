package StringExample;

import java.util.Stack;

public class validPalindrome {

	public static void main(String[] args) {
		checkPalindrome("A man, a plan, a canal, Panama! ");
		checkPalindrome("TST");
		checkPalindrome("A123321A");
		checkPalindrome("AB12321BBA");
		checkPalindrome("#!@$% Ab !@%!@ B  !%@!%!@% a  1%!@% C  !@%!@% a  1%!@% B 1%!@% b @!#)(*) A ");
	}
	
	public static void checkPalindrome(String usrStr) {
		
		Stack<Character> temp = new Stack<Character>();	
		boolean result = true;
		
		for (int i =0; i < usrStr.length(); i++) {
			if (Character.isLetterOrDigit(usrStr.charAt(i))) {
				temp.push(Character.toLowerCase(usrStr.charAt(i)));
			}
		}
		
		for (int j= 0; j<usrStr.length(); j++) {
			if (Character.isLetterOrDigit(usrStr.charAt(j))) {
				if(!temp.isEmpty()) {
					Character cmp = temp.pop();
					Character urtmp = Character.toLowerCase(usrStr.charAt(j));					
					if(!(cmp == urtmp)) {result = false;}
				} else {result = false;}
			}			
		}
		
		System.out.println(usrStr + " = "+result);
	}
}
