
public class Main {

	public static void main(String[] args) {
		Animal cat1 = new Cat("jeff", "brown");
		System.out.println("My name is " + cat1.getName());
		System.out.println("My fur is " + ((Mammal) cat1).getFurColor());
		cat1.sleep();
		((Cat) cat1).getSound(); //must be downcast to cat, as is animal
		((Mammal) cat1).controlTemperature("+",1); //must be downcast to mammal, as is animal
		
		System.out.println("\n"); //console separator

		Mammal cat2 = new Cat("bob", "gray");
		System.out.println("My name is " + cat2.getName());
		System.out.println("My fur is " + cat2.getFurColor());
		cat2.sleep();
		((Cat) cat2).getSound(); //must be downcast to cat, as is mammal
		cat2.controlTemperature("/",1);
		
		System.out.println("\n"); //console separator

		Cat cat3 = new Cat("trish", "orange");
		System.out.println("My name is " + cat3.getName());
		System.out.println("My fur is " + cat3.getFurColor());
		((Animal) cat3).sleep(); //override takes precedence as is cat object, not hierarchy (animal)
		cat3.getSound();
		cat3.controlTemperature("-",1);
		
		System.out.println("\n"); //console separator
		
		Dog dog1 = new Dog("rex", "black");
		System.out.println("My name is " + dog1.getName());
		System.out.println("My fur is " + dog1.getFurColor());
		dog1.sleep();
		dog1.getSound();
		dog1.controlTemperature("+",1);
		
		System.out.println("\n"); //console separator
		
		Animal plat1 = new Platypus("perry", "purple");
		System.out.println("My name is " + plat1.getName());
		System.out.println("My fur is " + ((Mammal) plat1).getFurColor());
		plat1.sleep();
		((Platypus) plat1).venomProperties();
		((Platypus) plat1).teethProperties();
		//((Cat) plat1).getSound(); //throws ClassCastException, same level in hierarchy, can only up/downcast
		((Mammal) plat1).controlTemperature("+",1);
		
		System.out.println("\n"); //console separator
		
		Mammal plat2 = new Platypus("jerry", "burgundy");
		System.out.println("My name is " + plat2.getName());
		System.out.println("My fur is " + plat2.getFurColor());
		plat2.sleep();
		((Platypus) plat2).venomProperties();
		((Platypus) plat2).teethProperties();
		plat2.controlTemperature("-",1);
		
		System.out.println("\n"); //console separator
		
		Platypus plat3 = new Platypus("merry", "cherry");
		System.out.println("My name is " + plat3.getName());
		System.out.println("My fur is " + plat3.getFurColor());
		plat3.sleep();
		plat3.venomProperties();
		plat3.teethProperties();
		plat3.controlTemperature("/",1);
	}
	
}
