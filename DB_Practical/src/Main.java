import java.sql.*;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdcb:mysql://localhost:3306/school_database","root","root");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM students");
			
			while(rs.next()) {
				System.out.println(rs.getInt("student_id") + " " + rs.getString("first_name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

}
