package test;

class Person1 {
	private int ssn;
	private String name;
	private int age;
	public Person1(int ssn, String name, int age) {
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Student1 extends Person1 {
	private int rno;
	private double sub1;
	private double sub2;
	private double sub3;
	public Student1(int ssn, String name, int age, int rno, double sub1, double sub2, double sub3) {
		super(ssn, name, age);
		this.rno = rno;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public double getTotalMarks() {
		return sub1+sub2+sub3;
	}
	public double getAverage() {
		return (sub1+sub2+sub3)/3;
	}
	public String getResults() {
		if (sub1>=40 && sub2>=40 && sub3>=40)
		return "Passed";
		else 
		return "failed";
	}
	public String getDivision() {
		if (sub1>=40 && sub2>=40 && sub3>=40) {
			double average = getAverage();
			if(average>=70)
			return "First";
			if(average>=50)
			return "Second";
			else 
			return "third";
			
		}
		else
		return "nill";
	}
}

public class Test8 {
	public static void main(String args[]) {
		Student1 s = new Student1 (1001,"Baron corbin",16,101,39,100,90);
		System.out.println("SSN = "+s.getSsn());
		System.out.println("NAME = "+s.getName());
		System.out.println("AGE = "+s.getAge());
		System.out.println(s.getRno());
		System.out.println(s.getTotalMarks());
		System.out.println(s.getAverage());
		System.out.println(s.getResults());
		System.out.println(s.getDivision());

	}
}
