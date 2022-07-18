package fileHandling_practical;


public class Main {
	public static void main(String[] args) {
		fileHandler filey = new fileHandler();
		
		String fname = "class_test.txt";
		filey.makeFile(fname);
		filey.writeFileFile(fname);
	}

}
