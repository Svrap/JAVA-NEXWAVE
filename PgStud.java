package test;

public class PgStud extends Student1 {

	String OptionalSubject;
	String Specialization ;
	public String getOptionalSubject() {
		return OptionalSubject;
	}
	public void setOptionalSubject(String optionalSubject) {
		OptionalSubject = optionalSubject;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public PgStud(int ssn, String name, int age, int rno, double sub1, double sub2, double sub3, String optionalSubject,
			String specialization) {
		super(ssn, name, age, rno, sub1, sub2, sub3);
		OptionalSubject = optionalSubject;
		Specialization = specialization;
	}
	
	public static void main(String [] args)
	{
		PgStud pgs = new PgStud(1001,"Baron corbin",16,101,139,100,90,"Hindi","Computers");
		System.out.println("SSN = "+pgs.getSsn());
		System.out.println("NAME = "+pgs.getName());
		System.out.println("AGE = "+pgs.getAge());
		System.out.println(pgs.getRno());
		System.out.println(pgs.getTotalMarks());
		System.out.println(pgs.getAverage());
		System.out.println(pgs.getResults());
		System.out.println(pgs.getDivision());
		System.out.println(pgs.getOptionalSubject());
		System.out.println(pgs.getSpecialization());

	}
}
