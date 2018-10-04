package core.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Returns Negative, Zero or Positive
 * 
 * 
 */
class Employee implements Comparable<Employee> {

	private int age;

	private String name;

	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		// descending
		return o.age - this.age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}

public class ComparableExample {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "ABC");
		Employee emp2 = new Employee(2, "ABC");
		Employee emp3 = new Employee(3, "ABC");
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		Collections.sort(emps);
		for (Employee em : emps) {
			System.out.println(em.getAge());
			System.out.println(em.getName());
		}
	}
}
