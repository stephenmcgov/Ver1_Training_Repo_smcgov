
public class InvalidChoiceException extends Exception {
	//want to extend/replace InputMismatchException but usage still throws InputMismatchException instead and fails to continue
	public InvalidChoiceException() {
		System.out.println("That choice was invalid!");
	}
	
}
