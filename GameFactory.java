
import java.util.Scanner;
public class GameFactory {
	
	public static void main(String[] args) throws Exception  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'StartGame' To Play Game");
		String start = sc.next();
		
	   start(start);
	}	
	public static Game start(String start) throws Exception {
		if(start.equalsIgnoreCase("startgame")) {
		    }
			 return new Game();
		}
	}

