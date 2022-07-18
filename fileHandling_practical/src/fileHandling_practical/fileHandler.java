package fileHandling_practical;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandler {
	/*try {
		  File f = new File("files/filename.txt");
		  f.createNewFile();
	      
		  FileWriter w1 = new FileWriter("files/filename.txt");
		  w1.write("writing to file...");
		  w1.close();
	      
	      FileWriter w2 = new FileWriter("files/filename.txt",true);
	      w1.write("\nappending to file...");
	      
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	}*/
	public File makeFile(String name) {
		File f = new File("resources/"+name);
		try {
			f.createNewFile();
			System.out.println("Successfully created the file.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
	}
	
	public void writeFileFile(String name) {
		File f = new File("files/"+name);
		try {
			 FileWriter w1 = new FileWriter("resources/"+name);
			 w1.write("writing to file...");
			 w1.close();
			 System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

