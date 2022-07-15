import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
			    e.printStackTrace();
			} 
			
			try {
				String url = "jdbc:mysql://localhost:3306/clickerdb";
				this.conn = DriverManager.getConnection(url,username,password);
				this.stmt = conn.createStatement();
				//test statement
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
		
		//get player clicks
		public String retrievePlayerClicks(String playerName) {
			int result = 0;
			try {
				this.stmt = conn.createStatement();
				String query = "SELECT * FROM players WHERE player_name LIKE '"+playerName+"';";
				try (Statement stmt = conn.createStatement()) {
				     ResultSet rs = stmt.executeQuery(query);
				     while (rs.next()) {
				    	 result = rs.getInt("clicks");
				     }
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("result:"+result);
			return Integer.toString(result);
		}
		
		//update player
		public void updatePlayer(String playerName, int clicks) {
			System.out.println("clicks:"+clicks);
			try {
				this.stmt = conn.createStatement();
				String query = "SELECT * FROM players WHERE player_name LIKE '"+playerName+"';";
				PreparedStatement prepStmt= conn.prepareStatement(query,
					    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				
				try (Statement stmt = conn.createStatement()) {
				     ResultSet rs = prepStmt.executeQuery(query);
				     while (rs.next()) {
				    	 rs.updateInt("clicks", clicks);
				    	 rs.updateRow();
				     }
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public boolean checkPlayer(String playerName, String catchphrase) {
			boolean exists = false;
			System.out.println("looking for player:"+playerName+" "+catchphrase);
			try {
				this.stmt = conn.createStatement();
				String query = "SELECT * FROM players WHERE player_name LIKE '"+playerName+"';";
				try (Statement stmt = conn.createStatement()) {
				     ResultSet rs = stmt.executeQuery(query);
				     while (rs.next()) {
				    	 if(rs.getString("player_name")==playerName);
				    	 {
				    		 exists = true;
				    		 System.out.println("existing player:"+playerName+" "+catchphrase);
				    	 }
				     }
				}
				if (!exists) {
					System.out.println("new player:"+playerName+" "+catchphrase);
					query = "INSERT INTO players (player_name, catchphrase, clicks) VALUES('"+playerName+"','"+catchphrase+"','0');";
					try (Statement stmt = conn.createStatement()) {
						 stmt.executeUpdate(query);				 
					}
				} 
			} catch (SQLException e) {
				e.printStackTrace();
			
		}
		return exists;
		}

		public String retrievePlayerCatchphrase(String playerName) {
			String catchphrase = "";
			try {
				this.stmt = conn.createStatement();
				String query = "SELECT * FROM players WHERE player_name LIKE '"+playerName+"';";
				try (Statement stmt = conn.createStatement()) {
				     ResultSet rs = stmt.executeQuery(query);
				     while (rs.next()) {
				    	 catchphrase = rs.getString("catchphrase");
				     }
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println(" catchphrase:"+catchphrase);
			return catchphrase;
		}
		
		//DB get methods
		/*Example queries
		public String getCustomers() {
			this.results = "";
			try {
				this.stmt = conn.createStatement();
				this.rs = stmt.executeQuery("SELECT * FROM customer WHERE customer_id IS NOT NULL");
				while(rs.next()) {
					this.results += ("\n" + rs.getInt("customer_id") + " " + rs.getString("first_name"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return results;
		}
		
		public String getPurchasesByDate() {
			this.results = "";
			try {
				this.stmt = conn.createStatement();
				this.rs = stmt.executeQuery("SELECT purchase_id, p.prod_name, purchases.quantity, purchase_date, purchases.quantity*p.price AS total_price FROM purchases JOIN products p ON p.product_id = purchases.pid ORDER BY purchase_date");
				while(rs.next()) {
					this.results += ("\n" + "PURCHASE ID: " + rs.getString("purchase_id") + " NAME: " + rs.getString("prod_name") + " QTY: " + rs.getString("purchases.quantity") + " TOTAL: " + rs.getString("total_price") + " DATE: " + rs.getString("purchase_date"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return results;
		}*/
		
		//DB post methods
		
}
