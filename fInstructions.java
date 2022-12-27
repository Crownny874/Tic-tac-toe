
public class fInstructions  {
	private static final long serialVersionUID = 1L;
  fInstructions(int player) throws  MyExceptions {
	 if(player==0|player==1|player==2|player==3|player==4|player==5|player==6|player==7|player==8) {
		
		} else {
		throw new MyExceptions("Follow Instructions Enter Index From 1 to 8");
		}
	}
	}