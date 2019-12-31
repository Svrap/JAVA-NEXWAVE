package dummy;

public class Student {
	 int Rollno;
	 String Name;
	 int Maths;
	 int Science;
	 int social;
	//private char[] getDivision;
	public Student(int rollno, String name, int maths, int science, int social) {
		this.Rollno = rollno;
		this.Name = name;
		this.Maths = maths;
		this.Science = science;
		this.social = social;
	}
	public int getRollno() {
		return Rollno;
	}
	public String getName() {
		return Name;
	}
	public int getMaths() {
		return Maths;
	}
	public int getScience() {
		return Science;
	}
	public int getSocial() {
		return social;
	}
	public int getTotal() {
		return Maths+Science+social;
	}
	public int getAverage() {
		return ((Maths+Science+social)/3);
	}
	public String getResults() {
		if(Maths>40 && Science > 40 && social >40)
		{
			return "Passed";
			
		}
		return "Failed";
	}
	public String getDivision() {
		if(Maths>40 && Science > 40 && social >40) {
		int avg= getAverage();
		if(avg>70)
		{
	        return "First class";
		}
		else if(avg>50)
		{
			 return "second class";
		}
		else
		{
			 return "third class";
		}
		}
		else
			return "Nill ";
	}
	
	public static void main(String [] args)
	{
		Student[] s = { new Student(101,"john",10,80,70) ,new Student(101,"john",10,80,70)  };
		for(int i=0;i<2;i++)
		{
		System.out.println(s[i].getRollno());
		System.out.println(s[i].getName());
		System.out.println(s[i].getTotal());
		System.out.println(s[i].getAverage());
		System.out.println(s[i].getResults());
		System.out.println(s[i].getDivision());
		System.out.println("\n");
		}
		
		
	}
	
}
