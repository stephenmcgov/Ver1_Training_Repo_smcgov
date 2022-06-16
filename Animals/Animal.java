
public abstract class Animal {
	protected String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sleep() {
		System.out.println("I sleep like an animal does.");
	}
}
