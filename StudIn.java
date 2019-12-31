package dummy;

public class StudIn extends Person {

	
	int Rollno;
	 String Name;
	 int Maths;
	 int Science;
	 int social;
	 
			public static void main(String args[]) {
				Student e = new Student(101,"Ajay",20,21,"ajay",24,35,70);
				System.out.println(e.getRollno());
				System.out.println(e.getName());
				System.out.println(e.getTotal());
				System.out.println(e.getAverage());
				System.out.println(e.getResults());
				System.out.println(e.getDivision());
			}

		

   public StudIn(int ssn, String name, int age, int rollno, String name2, int maths, int science, int social) {
		 super(ssn, name, age);
		 Rollno = rollno;
		 Name = name2;
		 Maths = maths;
		 Science = science;
		 this.social = social;
	}
   public int getRollno() {
	return Rollno;
   }
   public void setRollno(int rollno) {
	   Rollno = rollno;
   }
   public String getName() {
	   return Name;
   }
   public void setName(String name) {
	   Name = name;
   	}
   public int getMaths() {
	   return Maths;
   }
   public void setMaths(int maths) {
	   Maths = maths;
   }
   public int getScience() {
	   return Science;
   }
   public void setScience(int science) {
	   Science = science;
   }
   public int getSocial() {
	   return social;
   }	
   public void setSocial(int social) {
	   this.social = social;
   }




}