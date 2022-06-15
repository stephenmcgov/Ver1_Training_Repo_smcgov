
public class Main {
	/*public static void main(String[] args) {
		printToScreen();
		printToScreen2();
		
		Main main = new Main();
		main.printToScreen2();
	}
	
	public static printToScreen() {
		System.out.println("Hello Wold");
	}
	
	public void printToScreen2() {
		System.out.println("Hello Wold");
	}*/
	
	public static void main(String[] args) {
		//public Character (String name, String archetype, String history, int health, int atk)
		Protag Sergei = new Protag ("Sergei","Warrior","Warrior from Grozni",50,10, "Thou shalt fall!");
		Antag Enemy = new Antag ("Drone", 20, 2, "Forgive me Boss!");
		Antag Boss = new Antag ("Boss", 50, 5, "How???!");
	}
}
