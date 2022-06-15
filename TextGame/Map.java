import java.util.Scanner;
import java.util.Random;

public class Map {
	Protag protag;
	Antag antag;
	private int boundX;
	private int boundY;
	private int targetX;
	private int targetY;
	private int protagX;
	private int protagY;
	private int antagX;
	private int antagY;
	
	public Map (int boundX, int boundY, Protag protag, Antag antag) {
		this.boundX = boundX;
		this.boundY = boundY;
		this.protag = protag;
		this.antag = antag;
	}
	
	public void initMap() {
		targetX = randomiseX();
		targetY = randomiseY();
		
		protagX = randomiseX();
		protagY = randomiseY();
		if((protagX == targetX && protagY == targetY) || (protagX == antagX && protagY == antagY)) initMap();
		
		antagX = randomiseX();
		antagY = randomiseY();
		if((antagX == targetX && antagY == targetY) || (antagX == protagX && antagY == protagY)) initMap();
	}
	
	public int randomiseX() {
		Random rand = new Random();
		int retX;
		retX = rand.nextInt(boundX);
		return retX;
	}
	
	public int randomiseY() {
		Random rand = new Random();
		int retY;
		retY = rand.nextInt(boundY);
		return retY;
	}
	
	public void move() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter direction to move. Valid options are North, South, West, East.");
		String dir = sc.nextLine();
		
		switch(dir) {
		case "North":
			protagY += 1;
			if(protagY > boundY) protagY = 0;
			break;
		case "South":
			protagY -= 1;
			if(protagY < 0) protagY = boundY;
			break;
		case "West":
			protagX -= 1;
			if(protagX < 0) protagX = boundX;
			break;
		case "East":
			protagX += 1;
			if(protagX > boundX) protagX = 0;
			break;
		default :
            System.out.println("Invalid move! Ending game!");
            Main.endGame();
		}
		if (protagX == targetX && protagY == targetY) {
			System.out.println("Player: " + protag.getWinCry());
			System.out.println("Enemy: " + antag.getLoseCry());
			Main.endGame();
		}
		else if(protagX == antagX && protagY == antagY) doBattle();
		
		Random antagRand = new Random();
		int antagDir = antagRand.nextInt(4);
		
		switch(antagDir) {
		case 0:
			antagY += 1;
			if(antagY > boundY) antagY = 0;
			break;
		case 1:
			antagY -= 1;
			if(antagY < 0) antagY = boundY;
			break;
		case 2:
			antagX -= 1;
			if(antagX < 0) antagX = boundX;
			break;
		case 3:
			antagX += 1;
			if(antagX > boundX) antagX = 0;
			break;
		}
		if (antagX == targetX && antagY == targetY) {
			System.out.println("Enemy: " + antag.getWinCry());
			System.out.println("Player: " + protag.getLoseCry());
			Main.endGame();
		}
		else if(antagX == protagX && antagY == protagY) doBattle();
		
		System.out.println("Target position: " + "X="+ targetX + " Y=" + targetY);
		System.out.println("Player's current position: " + "X="+ protagX + " Y=" + protagY);
		System.out.println("Enemy's current position: " + "X="+ antagX + " Y=" + antagY);
		System.out.println("Enemy has moved!");
		
		if((antagX == protagX+1 || antagX == protagX-1 || antagX == protagX) && (antagY == protagY+1 || antagY == protagY-1 || antagY == protagY))
			System.out.println("Enemy is close!!!");
	}
	
	private void doBattle() {
		System.out.println("A chance encounter!");
		Random battleRand = new Random();
		int outcome = battleRand.nextInt(2);
		
		if (outcome == 0) {
			System.out.println("Player: " + protag.getWinCry());
			System.out.println("Enemy: " + antag.getLoseCry());
			Main.endGame();
		}
		
		else {
			System.out.println("Enemy: " + antag.getWinCry());
			System.out.println("Player: " + protag.getLoseCry());
			Main.endGame();
		}
	}

	public int getTargetX() {
		return this.targetX;
	}
	
	public int getTargetY() {
		return this.targetY;
	}

	public int getProtagX() {
		return this.protagX;
	}
	
	public int getProtagY() {
		return this.protagY;
	}
	
	public int getAntagX() {
		return this.antagX;
	}
	
	public int getAntagY() {
		return this.antagY;
	}
}
