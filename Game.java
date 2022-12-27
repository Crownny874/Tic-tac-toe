import java.util.*;
import java.util.Scanner;
public class Game {
	static int i = 0;
	Game() throws Exception {
	char[][] game = {{'_','_','|','_','_','|','_','_'},
     	             {'_','_','|','_','_','|','_','_'},
		             {'_','_','|','_','_','|','_','_'}};
	char[] ends = {'G','A','M','E',' ','E','N','D','S'};
		
		
	  
   System.out.println("Welcome To Henry's Tic-Tac-Toe Game");
	 System.out.println("You Are Given 8 Trials \nYour Symbol is 'X'");
	   Thread.sleep(1000);
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter PlayerName To Sign In");
	 String UserName = sc.next();
	 new Settings(UserName);
	 for(i = 0; i < 8; i++) {
	 System.out.println("Enter Index[0-8]:");
	 int player = sc.nextInt();	 
	 new fInstructions(player);
	 Random r = new Random();
	 int cpu = r.nextInt(8);
	
	 new GameBoard("Player",player,game);
	 new GameBoard("CPU",cpu,game);
	 new PrintGame(game);
	 new CreateWins(game,player,cpu,i);
}	
		if(isFull(game)) {
	     sc.close();
	System.out.println("Thanks For Playing Our Game, Enjoy Playing!");
	new PrintGameEnds(ends);
			}
		else {
		 i++;
		}
}
public static boolean isFull(char[][] game) {
	if(
game[0][0] != '_' && 
game[0][3] != '_' && 
game[0][6] != '_' && 
game[1][0] != '_' && 
game[1][3] != '_' &&
game[1][6] != '_' &&
game[2][0] != '_' &&
game[2][3] != '_' &&
game[2][6] != '_'
)
{
	 return true;
 }
  else {
			}
	  return false;
		}
		}
		
	
