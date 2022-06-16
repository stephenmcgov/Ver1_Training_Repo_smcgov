import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	private static boolean gameOver = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Protag Hero = new Protag ("Sergei", "I am victorious!", "I have failed!");
		Antag Enemy = new Antag ("Drone", "I always win!", "You cheated!");
		Map gameMap = new Map(9,9, Hero, Enemy);
		
		try {
			playGame(gameMap);
		} catch (InputMismatchException | InvalidChoiceException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to play again? Enter Y or N");
		String opt = sc.nextLine();
		
		if(opt.toUpperCase().equals("Y")) {
			gameOver = false;
			try {
				playGame(gameMap);
			} catch (InputMismatchException | InvalidChoiceException e) {
				e.printStackTrace();
			}
		}
		else if (opt.toUpperCase().equals("N")) {
			System.out.println("Thanks for playing!");
			System.exit(0);
		}
		else {
			System.out.println("Invalid entry! Ending game!");
			System.exit(0);
		}
	}

	public static void endGame() {
		gameOver = true;
	}
	
	public static void playGame(Map gameMap) throws InvalidChoiceException {
		gameMap.initMap();
		System.out.println("TargetX=" + gameMap.getTargetX() + " TargetY=" + gameMap.getTargetY());
		System.out.println("PlayerX=" + gameMap.getProtagX() + " PlayerY=" + gameMap.getProtagY());
		System.out.println("EnemyX=" + gameMap.getAntagX() + " EnemyY=" + gameMap.getAntagY());
		
		while (gameOver!= true) {
			gameMap.move();
		}
	}
}
