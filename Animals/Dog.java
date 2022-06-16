
public class Dog extends Mammal {
	
	public Dog(String name, String furColor) {
		super(name, furColor);
	}

	private String sound = "woof";
	
	public void getSound() {
		System.out.println(sound);
	}
}
