package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

public class RemoveDuplicatesString {

	public RemoveDuplicatesString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//ArrayList values = new ArrayList();
		LinkedList values = new LinkedList();
		values.add(1);
		values.add("@");
		values.add(2);
		values.add(3);
		values.add("hello");
		values.add(2);

		// Create HashSet from ArrayList.
		HashSet set = new HashSet(values);

		//LinkedListNode 
		// Create ArrayList from the set.
		ArrayList result = new ArrayList(set);

		// The result.
		System.out.println(result.toString());
	    }
}
