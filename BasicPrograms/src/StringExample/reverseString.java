package StringExample;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usrString = "!dlroW olleH";

		String rvrString = "";
		
		for(int i = usrString.length()-1; i >= 0; i--) {
			
			rvrString = rvrString + usrString.charAt(i);
		}
		
		System.out.println(rvrString);
	}

}
