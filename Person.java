package test1;
import java.io.*;

public class Person implements java.io.Serializable {

	int ssn;
	String Name;
	int Age;
	
	public Person() {}

	public Person(int ssn, String name, int age) {
		super();
		this.ssn = ssn;
		Name = name;
		Age = age;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	
}
