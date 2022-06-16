
public class Cat extends Mammal {
	
	public Cat(String name, String furColor) {
		super(name, furColor);
	}

	private String sound = "meow";
	
	public void getSound() {
		System.out.println(sound);
	}
	
	@Override
	public void sleep() {
		System.out.println("I sleep like a cat does.");
	}
}
