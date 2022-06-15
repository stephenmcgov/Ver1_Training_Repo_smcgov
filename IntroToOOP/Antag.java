
public class Antag extends Character {
	
	String deathCry;
	
	public Antag(String name, int health, int atk, String deathCry) {
		super(name, health, atk);
		this.deathCry = deathCry;
	}
	
	public String getDeath() {
		return deathCry;
	}
}
