
public abstract class Character {
	private String name;
	private String winCry;
	private String loseCry;
	
	public Character (String name, String winCry, String loseCry) {
		this.name = name;
		this.winCry = winCry;
		this.loseCry = loseCry;
	}

	public String getName() {
		return name;
	}

	public String getWinCry() {
		return winCry;
	}

	public String getLoseCry() {
		return loseCry;
	}
	
}
