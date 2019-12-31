package test;
import java.util.ArrayList;

public class Traning {


	
	
	public static void main(String [] args)
	{
		ArrayList<Students> al = new ArrayList<>();
		
		al.add(new Students("ajay",20,101,10,"java"));
		al.add(new Students("vijay",20,102,10,"c"));
		al.add(new Students("ajay",20,103,10,"python"));
		al.add(new Students("ajay",20,104,10,"c++"));
		al.add(new Students("ajay",20,105,10,".net"));
		al.add(new Students("ajay",20,106,10,"java"));
		for(Students s: al)
			System.out.println(s);
		
	}
		
		
		
	}


class Students {
	String sName;
	int SAge;
	int Sid;
	int traningId;
	String traningName;
	public Students(String sName, int sAge, int sid, int traningId, String traningName) {
		super();
		this.sName = sName;
		this.SAge = sAge;
		this.Sid = sid;
		this.traningId = traningId;
		this.traningName = traningName;
	}
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getSAge() {
		return SAge;
	}
	public void setSAge(int sAge) {
		SAge = sAge;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public int getTraningId() {
		return traningId;
	}
	public void setTraningId(int traningId) {
		this.traningId = traningId;
	}
	public String getTraningName() {
		return traningName;
	}
	public void setTraningName(String traningName) {
		this.traningName = traningName;
	}
	@Override
	public String toString() {
		return "Students [sName=" + sName + ", SAge=" + SAge + ", Sid=" + Sid + ", traningId=" + traningId
				+ ", traningName=" + traningName + "]";
	}
	
	
	
	
	
	
}
