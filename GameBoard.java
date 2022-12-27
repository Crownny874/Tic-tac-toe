
public class GameBoard {
	
	GameBoard(String UserName,int player, char[][] game) {
	 char symbol;
	if(UserName.equals("Player")) {
		symbol = 'X';
	} else  {
		symbol = 'O';
	}
	switch(player) {
	  case 0:
		   game[0][0] = symbol;
			break;		
		case 1:
		    game[0][3] = symbol;break;
	  case 2:
		    game[0][6] = symbol;break;
		case 3:
		    game[1][0] = symbol;break;
		case 4:
		    game[1][3] = symbol;break;
		case 5:
	     game[1][6] = symbol;break;
     case 6:
        game[2][0] = symbol;break;
	  case 7:
	       game[2][3] = symbol;break;
		 case 8:
	       game[2][6] = symbol;break;default:
       System.out.println();
	}
	}
	}