
public abstract class Character {
	private String name;
	private String archetype;
	private String history;
	private int health;
	private int atk;
	
	public Character (String name, String archetype, String history, int health, int atk) {
		this.name = name;
		this.archetype = archetype;
		this.setHistory(history);
		this.setHealth(health);
		this.setAtk(atk);
	}
	
	public Character (String name, int health, int atk) {
		this.name = name;
		this.setHealth(health);
		this.setAtk(atk);
	}

	public String getName() {
		return name;
	}

	public String getArchetype() {
		return archetype;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
}
