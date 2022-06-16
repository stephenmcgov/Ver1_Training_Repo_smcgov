
public abstract class Mammal extends Animal {
	protected String furColor;
	protected int temperature;

	public Mammal(String name, String furColor) {
		this.name = name;
		this.furColor = furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	public String getFurColor() {
		return furColor;
	}
	
	public void controlTemperature(String op, int amount) {
		if(op.equals("+")) temperature = temperature + amount;
		else if(op.equals("-")) temperature = temperature - amount;
		else System.out.println("Invalid operator passed!");
		
		System.out.println("Temperature=" + temperature);
	}
}
