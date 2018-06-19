package Practice;

import java.util.Scanner;

public class ReverseStringWordByWord {

	public ReverseStringWordByWord() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String [] args){

		Scanner scannerObject = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = scannerObject.nextLine();
		System.out.println("Reversed string is: "+ reverse(str));
		
	}
	public static String reverse(String str) {
	char charArray[] = str.toCharArray();
    for (int i = 0; i <str.length(); i++){
        if(charArray[i] == ' ')
        return reverse(str.substring(i + 1)) + str.substring(0, i) + " ";
    }
    return str + " ";
	}
}
