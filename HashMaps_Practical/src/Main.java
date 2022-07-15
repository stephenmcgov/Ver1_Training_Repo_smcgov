import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> myMap = new HashMap<>();
		
		myMap.put("a", "1");
		myMap.put("b", "2");
		myMap.put("c", "3");
		myMap.put("d", "4");
		myMap.put("e", "5");
		
		ListManager man = new ListManager();
		man.getProperties(myMap);
	}

}
