import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		Database db = new Database("root","root");
		
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
