import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loggedIn = false;
		Database db = null;
		
		System.out.println("+----------------------------------------------------+");
		System.out.println("+--------------Welcome to Customer DB----------------+");
		System.out.println("+----------------------------------------------------+");
		while(!loggedIn) {
			System.out.println("|> Please enter your username");
			String username = (sc.nextLine().strip());
			System.out.println("|> Please enter your password");
			String password = (sc.nextLine().strip());
			
			db = new Database(username, password);
			if (db.getLoggedIn()) {
				System.out.println("+----------------Logged In-------------------+");
				loggedIn = true;
			}
			else {
				System.out.println("+------------------ERROR---------------------+");
			}
			
			String customerList = "\nCustomer List:\n-------------------------------\n" + db.getCustomers();
			System.out.println(customerList);
			
			String productList = "\nProduct List:\n-------------------------------\n" + db.getProducts();
			System.out.println(productList);
			
			String purchaseListByDate = "\nPurchase List By Date:\n-------------------------------\n" + db.getPurchasesByDate();
			System.out.println(purchaseListByDate);
		}
	}
}
