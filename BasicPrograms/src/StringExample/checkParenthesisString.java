package StringExample;

import java.util.Stack;

public class checkParenthesisString {

	public static void main(String[] args) {
		
		checkParenthesis("((()))))");

	}
	
	public static void checkParenthesis(String usrString){

	    Stack<Character> temp = new Stack<Character>();
	    
	    boolean result = true;
	    
	    for (int i = 0; i < usrString.length(); i++){
	    
	        if (usrString.charAt(i) == '('){
	        
	            temp.push(usrString.charAt(i));
	            
	        } else if (usrString.charAt(i) == ')'){
	        	
	        	if (temp.isEmpty()) {
	        		
	                result = false;
	                
	        	} else {
	        
	            char tmp = temp.pop();
	        
	            if (tmp == '('){
	            
	                continue;            
	            } else {
	                result = false;
	            }
	            
	            break;
	        } }
	    }

	    System.out.println(result); 

	}

}
