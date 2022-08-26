package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Tony Qu 

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "y";
		
		//add in a do while loop after you get the basics up and running
		RockPaperScissors game = new RockPaperScissors();	
		while(response.equals("y")) {
			String player = "";
			
			out.print("\ntype in your weapon [R,P,S] :: ");
			
			//read in the player value
			player = keyboard.next();
			game.setPlayers(player);
			out.print(game);
			
			out.print("\nDo you want to play again? (y,n) :: ");
			response = keyboard.next();
		}
		out.println("Ok bye!");
			
			
	}
}



