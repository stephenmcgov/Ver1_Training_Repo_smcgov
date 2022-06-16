
public class Platypus extends Mammal implements IReptile, IBird, IToothless {
	Platypus(String name, String furColor){
		super(name,furColor);
	}
	
	String sound = "?????";
	
	public void getSound() {
		System.out.println(sound);
	}
	
	@Override
	public void controlTemperature(String op, int amount) {
		if(op.equals("-")) temperature = temperature + amount;
		else if(op.equals("+")) temperature = temperature - amount;
		else System.out.println("Invalid operator passed!");
		
		System.out.println("Temperature=" + temperature);
	}
	
	@Override
	public void sleep() {
		System.out.println("I sleep like a Platypus does.");
	}
	
	@Override 
	public void venomProperties() {
		System.out.println("Enough to paralyse small animals, but not humans.");
	}
	
	@Override
	public void eggProperties() {
		System.out.println("Takes 28 days to develop, not suitable for eating.");
	}

	@Override
	public void teethProperties() {
		System.out.println("Has teeth?: " + hasTeeth);
	}
}
