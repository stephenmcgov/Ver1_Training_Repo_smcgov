package json_practical;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser parser = new JSONParser();
		JSONObject jObj = new JSONObject();
		/*
		String agg1 = "";
		String agg2 = "";
		String agg3 = "";
		//URL url = Main.class.getResource("src/main/resources/config.json");
		//System.out.println(url);
		//String absolutePath = url.getPath();
		//System.out.println(absolutePath.replace("target/classes", "src/main/resources"));
		
		//1
		FileReader reader = new FileReader("src/main/resources/json_arrays.json");
		Object obj = parser.parse(reader);
		JSONArray jArray = (JSONArray) obj;

		//System.out.println(jArray);
		
		for (int i=0; i<jArray.size(); i++) {
			//jObj = (JSONObject) jArray.get(i);
			//String firstName = (String) jObj.get("first_name");
			//System.out.println(firstName);
			System.out.println(jArray.get(i));
			agg1 += jArray.get(i);
			agg1 = agg1.substring(1, agg1.length()-1);
		}
		
		//2
		reader = new FileReader("src/main/resources/nested_objects.json");
		jObj = (JSONObject) parser.parse(reader);
		System.out.println(jObj);
		agg2 += jObj;
		agg2 = agg2.substring(1, agg2.length()-1);
		//JSONObject address = (JSONObject) jObj.get("address");
		//String street = (String) address.get("street");
		//String city = (String) address.get("city");
		//String county = (String) address.get("county");
		//String postcode = (String) address.get("postcode");
		//System.out.println(street+city+county+postcode);
		
		//3
		reader = new FileReader("src/main/resources/config.json");
		jObj = (JSONObject) parser.parse(reader);
		System.out.println(jObj);
		agg3 += jObj;
		agg3 = agg3.substring(1, agg3.length()-1);
		
		//stretch
		String agg = "{"+agg1+agg2+agg3+"}";
		System.out.println(agg);
		
		//create new json file
		//set content w/string + file extension
		*/
		jObj.put("version", 1.0);
		jObj.put("project", "File Handling");
		
		JSONObject subcat = new JSONObject();
		JSONObject user_prefs = new JSONObject();
		JSONObject users = new JSONObject();
		
		subcat = new JSONObject();
		subcat.put("show_print_statements", true);
		subcat.put("show_detailed_logs", false);
		subcat.put("auto_save", true);
		subcat.put("auto_save_time_seconds", 60);
		subcat.put("save_on_exit", true);
		jObj.put("settings", subcat);
		
		subcat = new JSONObject();
		user_prefs = new JSONObject();
		subcat.put("dark_mode", true);
		subcat.put("colour_blind", false);
		subcat.put("font_size", 11);
		user_prefs.put("user_preferences", subcat);
		users.put("Chester", user_prefs);
		
		subcat = new JSONObject();
		user_prefs = new JSONObject();
		subcat.put("dark_mode", false);
		subcat.put("colour_blind", false);
		subcat.put("font_size", 13);
		user_prefs.put("user_preferences", subcat);
		users.put("Sam", user_prefs);
		
		jObj.put("users:", users);
		
		System.out.println(jObj);
		FileWriter f = new FileWriter("writing_json_files.json");
		f.write(jObj.toJSONString());
		f.flush();
	}
}
