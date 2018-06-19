package Practice;


	import java.util.HashMap;
	import java.util.Scanner;

	public class CharacterRepeatPrint {
		public static void main(String[] args) {
			
			System.out.println("Please Enter a String: ");
			
			Scanner sc = new Scanner(System.in);
			String userInput = sc.next();
			
			CharacterRepeatPrintMethod(userInput);
			
		}

		public static Character CharacterRepeatPrintMethod(String userInput) {
			
			char[] charArr = userInput.toCharArray();
			HashMap<Character, Integer> mapArr = new HashMap<Character, Integer>();
			
			for (int i=0; i < charArr.length; i++){
				
				if(mapArr.containsKey(charArr[i])){
					
					mapArr.put(charArr[i], mapArr.get( charArr[i] ) + 1);
				}
				else{
					
					mapArr.put(charArr[i], 1);
				}
			}
			
			
			for (char alpha = 'a'; alpha <= 'z'; alpha++){
			
				if(mapArr.containsKey(alpha) ){
					
					
					if(mapArr.get(alpha)>1){
						
						System.out.print("(" + alpha + " " +mapArr.get(alpha) + ")" + " ");	
					}
					
				}
							
			}
			
			
			for (char alpha = 'A'; alpha <= 'Z'; alpha++){
				
				if(mapArr.containsKey(alpha) ){
					
					if(mapArr.get(alpha)>1){
						
						System.out.print("(" + alpha + " " +mapArr.get(alpha) + ")" + " ");	
					}
					
				}
							
			}
				
			
			return null;
		}
		
}
