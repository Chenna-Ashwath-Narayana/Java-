import java.sql.*;

public class Insert_Record {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","123");
			Statement stmt = con.createStatement();
			
			int i = stmt.executeUpdate("insert into employee values (11,'ashwath','ashwath@gmail.com','sw',45000.00)");
			System.out.println("New data inserted successfully");
			
//			int a = stmt.executeUpdate("insert into employee values (22,'Rohith','rohith@gmail.com','student',40000.00)");
//			System.out.println("New Data inserted successfully");
			
			con.close();
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}
}
