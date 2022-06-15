import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> ISBNs = new HashMap();
		
		ISBNs.put("a1", "The Social Contract");
		ISBNs.put("b2", "The Myth Of Sisyphus");
		ISBNs.put("c3", "The Master And Margarita");
		
		for (Entry<String, String> entry : ISBNs.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    System.out.println("Key: " + key + " | Value: " + value);
		}
	}

}
