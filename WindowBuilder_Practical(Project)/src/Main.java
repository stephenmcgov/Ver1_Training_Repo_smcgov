import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		Database db = new Database("root","root");
		int i,j,k;
		i = j = k = 9;
		System.out.println(i);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login(db);
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
