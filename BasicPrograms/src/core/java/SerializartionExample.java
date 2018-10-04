package core.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * We can convert a Java object to an
 * Stream that is called Serialization.
 * Once an object is converted to
 * Stream, it can be saved to file or
 * send over the network or used in
 * socket connections. The object should
 * implement Serializable interface
 * 
 * Serialization id is used to
 * deserialize object on other machine
 * 
 * 
 *
 */
public class SerializartionExample {
	public static void main(String[] args) {
		EmployeeObject emp = new EmployeeObject();
		emp.setAge(10);
		emp.setGender("Male");
		emp.setName("sidhu");

		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("c:\\temp\\Emp.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Done");
			// Deserialization
			FileInputStream is = new FileInputStream("c:\\temp\\Emp.ser");
			ObjectInputStream ois = new ObjectInputStream(is);
			EmployeeObject emps = (EmployeeObject) ois.readObject();
			ois.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class EmployeeObject implements Serializable {

	private static final long serialVersionUID = -299482035708790407L;

	private String name;
	private String gender;
	private int age;
	private String role;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee:: Name=" + this.name + " Age=" + this.age + " Gender=" + this.gender + " Role=" + this.role;
	}

}
