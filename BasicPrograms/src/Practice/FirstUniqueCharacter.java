package Practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstUniqueCharacter {
	
	public static void main(String[] args) {
	
	System.out.println("Please print string: ");
	Scanner sc = new Scanner(System.in);
	String userstring = sc.next();
	
	FirstUniqueCharacter f1 = new FirstUniqueCharacter();
	f1.firstNonRepeating(userstring);
	
	}
	
	public Character firstNonRepeating(String s)
	{
		char[] strChars = s.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		Queue<Character> strQueue = new LinkedList<Character>();
		
		for(int i = 0; i < strChars.length; i++)
		{
			if(charMap.containsKey(strChars[i]))
			{
				charMap.put(strChars[i], charMap.get(strChars[i]) + 1);
			}
			else
			{
				charMap.put(strChars[i], 1);
				strQueue.add(strChars[i]);
			}
		}
		
		while(!strQueue.isEmpty())
		{
			char firstUnique = strQueue.poll();
			if(charMap.get(firstUnique) == 1)
			{
				System.out.println(firstUnique);
				return firstUnique;
				
			}
		}
		return null;
	}

}
