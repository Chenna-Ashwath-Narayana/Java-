import java.sql.*;

public class JdbcPractice {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","123");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("create table employee(eid int(40),name varchar(40),email varchar(40),designation varchar(40),salary double)");
		System.out.println("New Table is Created");
		
		int i = stmt.executeUpdate("insert into employee values(125, 'Ashwath', 'ashwath@gmail.com', 'Developer', 45000.00)");
        System.out.println("New Record Created");
        
		con.close();
	} catch (Exception ex) {
		System.out.println(ex);
	}
}
}
