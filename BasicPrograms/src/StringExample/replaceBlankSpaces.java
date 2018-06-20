package StringExample;

public class replaceBlankSpaces {

	public static void main(String[] args) {
		
		String usrStr = "Hello World!  How are 	you?";
		String str = "";
		
		for (int i = 0; i < usrStr.length(); i++) {
			
			if(!(usrStr.charAt(i) == ' ' || usrStr.charAt(i) == '\t')) {
				str = str + usrStr.charAt(i);
			}
		}
		
		System.out.println(str);
	}
}