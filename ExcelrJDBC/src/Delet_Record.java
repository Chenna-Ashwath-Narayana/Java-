import java.sql.*;
public class Delet_Record {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","123");
			Statement stmt = conn.createStatement();
			
			int a = stmt.executeUpdate("delete from employee where eid=11");
			System.out.println("The Record is Deleted Successfully");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
