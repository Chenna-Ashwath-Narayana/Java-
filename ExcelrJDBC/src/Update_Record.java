import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Statement;*;
public class Update_Record {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","123");
			Statement stmt = con.createStatement();
			
			int i = stmt.executeUpdate("update employee set name ='Rohith Narayana',salary=70000.00 where eid=22 ");
			System.out.println("Updated Successfully");
			int a= stmt.executeUpdate("update employee  set designation='Software', salary=60000.00 where eid=11 ");
			System.out.println("Record Updated Successfully");
			con.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
