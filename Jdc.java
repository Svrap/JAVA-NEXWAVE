package test1;
import java.sql.*;  
class Jdc{  
public static void main(String args[]) throws ClassNotFoundException{  
try{  
	Class.forName("oracle.jdbc.driver.OracleDriver");  

Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/sonoo","root","root");  






//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  