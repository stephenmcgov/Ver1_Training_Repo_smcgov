import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
		private Statement stmt;
		private ResultSet rs;
		private Connection conn;
		private boolean loggedIn = false;
		private String results = "";
		
		public Database(String username, String password)
		{
			try {
			    Class.forName("com.mysql.cj.jdbc.Driver");
			} 
			catch (ClassNotFoundException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			} 
			
			try {
				String url = "jdbc:mysql://localhost:3306/customers";
				this.conn = DriverManager.getConnection(url,username,password);
				this.stmt = conn.createStatement();
				//rs = stmt.executeQuery("SELECT * FROM customers");
				this.rs = null;
				this.loggedIn = true;
						
				/*while(rs.next()) {
					System.out.println(rs.getInt("customer_id") + " " + rs.getString("first_name"));
				}*/
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			
		}
		
		public boolean getLoggedIn() {
			return this.loggedIn;
		}
		
		public void setLoggedIn(boolean loggedIn) {
			this.loggedIn = loggedIn;
			
		}
		
		public String getCustomers() {
			this.results = "";
			try {
				this.stmt = conn.createStatement();
				this.rs = stmt.executeQuery("SELECT * FROM customer WHERE customer_id IS NOT NULL");
				while(rs.next()) {
					this.results += ("\n" + rs.getInt("customer_id") + " " + rs.getString("first_name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return results;
		}
		
		public String getProducts() {
			this.results = "";
			try {
				this.stmt = conn.createStatement();
				this.rs = stmt.executeQuery("SELECT * FROM products");
				while(rs.next()) {
					this.results += ("\n" + rs.getInt("product_id") + " " + rs.getString("prod_name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return results;
		}
		
		public String getPurchasesByDate() {
			this.results = "";
			try {
				this.stmt = conn.createStatement();
				//this.rs = stmt.executeQuery("SELECT purchase_id, purchase_date, purchases.quantity, purchases.quantity*price AS total_price, prod_name FROM products, purchases ORDER BY purchase_date");
				this.rs = stmt.executeQuery("SELECT purchase_id, p.prod_name, purchases.quantity, purchase_date, purchases.quantity*p.price AS total_price FROM purchases JOIN products p ON p.product_id = purchases.pid ORDER BY purchase_date");
				while(rs.next()) {
					this.results += ("\n" + "PURCHASE ID: " + rs.getString("purchase_id") + " NAME: " + rs.getString("prod_name") + " QTY: " + rs.getString("purchases.quantity") + " TOTAL: " + rs.getString("total_price") + " DATE: " + rs.getString("purchase_date"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return results;
		}
}
