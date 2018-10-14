package StringExample;

public class truncateString {

	public static void main(String[] args) {
		truncateStringWithNumbers("aaaaaaabbbbbcccddddddeeeefffggabbbc");
	}
	
	public static void truncateStringWithNumbers(String usrString) {

		int temp = 1;
		String result = "";

		for (int i = 0; i < usrString.length(); i++) {

			for (int p = i + 1; p < usrString.length(); p++) {

				if (usrString.charAt(p) == usrString.charAt(i)) {
					temp++;
					i++;
				} else {
					break;
				}
			}			
				result = result + usrString.charAt(i) + Integer.toString(temp) + " ";
				temp = 1;
		}
		System.out.println(result);
	}
}
