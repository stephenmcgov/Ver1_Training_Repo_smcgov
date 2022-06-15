
public class Protag extends Character {
	
	String rallyCry;
	
	public Protag(String name, String archetype, String history, int health, int atk, String rallyCry) {
		super(name, archetype, history, health, atk);
		this.rallyCry = rallyCry;
	}
	
	public String getRally() {
		return rallyCry;
	}
}
