import java.util.HashMap;

public class ListManager implements iInteract {
	private HashMap<String, String> tempMap;
	
	/*public ListManager(HashMap m) {
		this.tempMap=map;
	}*/
	public ListManager() {
	}
	
	public void getProperties(HashMap map) {
		tempMap = map;
		for(String key : tempMap.keySet())
			System.out.println(key);
		
		for(String value : tempMap.values())
			System.out.println(value);
		
	}

}
