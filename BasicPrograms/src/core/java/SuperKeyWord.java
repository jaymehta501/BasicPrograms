package core.java;

class SuperExample {

	public SuperExample() {
		System.out.println("In Super class....");
	}

	public void test() {
		System.out.println("super class test method");
	}
}

public class SuperKeyWord extends SuperExample {

	public SuperKeyWord() {
		super();
		SuperKeyWord k = new SuperKeyWord();
		super.test();
		k.test();
	}

	@Override
	public void test() {
		System.out.println("sub class test method");
	}

	public static void main(String[] args) {
	}
}
