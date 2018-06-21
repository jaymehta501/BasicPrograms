package StringExample;

public class removeSpaces{

	public static void main(String[] args) {
		removeSpacesFromString("Jay is a G e e k .");
	}
	
	public static void removeSpacesFromString(String usrString) {
		
		String temp = "";
		
		for(int i =0; i < usrString.length(); i++) {
			if(!(usrString.charAt(i)==' ')) {
				temp = temp+usrString.charAt(i);
			}
		}		
		System.out.println(temp);
	}
}
