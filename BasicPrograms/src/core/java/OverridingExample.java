package core.java;

/**
 * The method argument list in
 * overridden and overriding methods
 * must be exactly same The return type
 * of overriding method can be child
 * class of return type declared in
 * overridden method. Above all rules,
 * private, static and final methods can
 * not be overridden in java in any way.
 * As simple as that !!
 * 
 */

class SuperClass {
	//Overriden method
	public Number sum(Integer a, Integer b) {
		return a + b;
	}
}

class SubClass extends SuperClass {
	//Overriding method
	@Override
	public Integer sum(Integer a, Integer b) {
		return a + b;
	}
}

public class OverridingExample {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		System.out.println(sc.sum(1, 2));
	}
}
