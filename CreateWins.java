
public class CreateWins {
	
	CreateWins(char[][] game,int player,int cpu,int i) {
	  String playerWins = "Player Wins";
	 String cpuWins = "Computer Wins";
	 
	
	  //Player Wins Straight
	if(game[0][0] == 'X' && game[0][3] == 'X' && game[0][6] == 'X') {
		System.out.println(playerWins);
	 } else if(game[1][0] == 'X' & game[1][3] == 'X' && game[1][6] == 'X'){
		 System.out.println(playerWins);
	 }
	 else if(game[2][0] == 'X' && game[2][3] == 'X' && game[2][6] == 'X') {
		 System.out.println(playerWins);
	 }
	 
	 
	   //Computer Wins //Straight
   if(game[0][0] == 'O' && game[0][3] == 'O' && game[0][6] == 'O') {
		System.out.println(cpuWins);
	}
	else if(game[1][0] == 'O' && game[1][3] == 'O' && game[1][6] == 'O') {
		System.out.println(cpuWins);
	}
	else if(game[2][0] == 'O' && game[2][3] == 'O' && game[2][6] == 'O') {
		System.out.println(cpuWins);
	}
	
	  // Player Wins Side
	 if(game[0][0] == 'X' && game[1][3] == 'X' && game[2][6] == 'X') {
		System.out.println(playerWins);
	}
	else if(game[0][6] == 'X' && game[1][3] == 'X' && game[2][0] == 'X') {
		System.out.println(playerWins);
	}
	else if(game[0][3] == 'X' && game[1][3] == 'X' && game[2][3] == 'X') {
		System.out.println(playerWins);
	}
	if(game[0][6] == 'X' && game[1][6] == 'X' && game[2][6] == 'X') {
		System.out.println(playerWins);
	}
	else if(game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == 'X') {
		System.out.println(playerWins);
	}
	
	
	    //Computer Wins Side
	if(game[0][0] == 'O' && game[1][3] == 'O' && game[2][6] == 'O') {
		System.out.println(cpuWins);
	}
	else if(game[0][6] == 'O' && game[1][3] == 'O' && game[2][0] == 'O') {
		System.out.println(cpuWins);
	}
	else if(game[0][3] == 'O' && game[1][3] == 'O' && game[2][3] == 'O') {
		System.out.println(cpuWins);
	}
	if(game[0][6] == 'O' && game[1][6] == 'O' && game[2][6] == 'O') {
		System.out.println(cpuWins);
	}
	else if(game[0][0] == 'O' && game[1][0] == 'O' && game[2][0] == 'O') {
		System.out.println(cpuWins);
	} else {
		if(game.equals(game.length)) {
	System.out.println("Game Ends In A Tie");
	}	
		 }
	    }
	}
	