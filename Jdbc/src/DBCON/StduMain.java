package DBCON;
import DBCON.StuDao;
import java.sql.Date;
import java.util.ArrayList;

public class StduMain {
	public static void main(String[] args) {
		//Student s = new Student(101,"vijay",21,new Date(1999,02,10));
		StuDao sd = new StuDao();
//----------------insert-------------


		//		if(sd.insertStudent(s))
		//		{
		//			System.out.println("Student Inserted");
		//		}
		//		else
		//			System.out.println("Student failed");
//---------------update-----------------

		//		
		//		if(sd.modifyStudent(s))
		//			System.out.println("Student Modified");
		//		else
		//			System.out.println("not modified");
//---------------retrieve elements------------
		//		ArrayList<Student> slist = sd.getStudent();
		//		for(Student s : slist)
		//			System.out.println(s.getRno()+" "+s.getName()+" "+s.getAge()+" "+s.getDob());
		//
//-------------retrieve single element---------
		//		Student s = sd.getStudnet(101);
		//		if(s!=null)
		//			System.out.println(s.getRno()+" "+s.getName()+" "+s.getAge()+" "+s.getDob());
		//		else
		//			System.out.println("Student not found");
//----------------delete Student---------------------
		if(sd.removeStudent(101))
			System.out.println("Student deleted");
		else
			System.out.println("student doest not exist");




	}
}
