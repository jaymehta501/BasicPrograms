package Misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator {

	public static void main(String[] args) {
		// Takes a list o Dog objects
		List<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("Shaggy", 3));
		list.add(new Dog("Lacy", 2));
		list.add(new Dog("Roger", 10));
		list.add(new Dog("Tommy", 4));
		list.add(new Dog("Tammy", 1));
		Collections.sort(list);// Sorts the array list default is ascending but we override compareTo and its returning descending
		for (Dog a : list)//printing the sorted list of names
			System.out.print(a.getDogName() + ", ");

		// Sorts the array list using comparator compare ages
		Collections.sort(list, new Dog());
		System.out.println(" ");
		for (Dog a : list)//printing the sorted list of ages
			System.out.print(a.getDogName() + "  : " + a.getDogAge() + ", ");
	}
}
