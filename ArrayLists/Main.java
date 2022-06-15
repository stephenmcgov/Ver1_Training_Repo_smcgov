import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> colorList = new ArrayList();
		
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Yellow");
		colorList.add("Black");
		colorList.add("White");
		colorList.add("Red");
		
		for (String col : colorList) {
			System.out.println(col);
		}
		
		System.out.println("\n"); //console separator

		ArrayList<String> eIndexes = new ArrayList();

		for (int i=0; i<colorList.size(); i=i) {
			String col = colorList.get(i);
			
			if (col.toLowerCase().contains("e")) {
				colorList.remove(colorList.get(i));
				continue;
				//remove the color at i and preserve i (as arraylist is now shrunk by 1)
			}
			else
				i++;
				//color ok, iterate i
		}

		for (String newcols : colorList) {
			System.out.println(newcols);
		}
		
		String[] colorArray = { "Blue", "Green", "Orange", "Yellow", "Black", "White", "Red" };
		String[] altcolArray = { "Cyan", "Burgundy", "Navy", "Maroon", "Fuschia", "Gray", "Aqua" };
		
		for(int j=0; j<colorArray.length; j++) {
			if(colorArray[j].contains("e")) colorArray[j] = altcolArray[j];
		}

		for (String newcols : colorList) {
			System.out.println(newcols);
		}
	}
}
