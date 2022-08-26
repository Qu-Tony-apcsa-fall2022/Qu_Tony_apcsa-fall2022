package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Tony Qu

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;
public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}
	public void playGame() {
		
	}
	public void setCompChoice() {
		String[] choices = {"R","P","S"};
		compChoice = choices[(int)Math.floor(Math.random()*3)];
	}
			
	public String determineWinner()
	{
		setCompChoice();
		return 	compChoice.equals("R") ? 
					playChoice.equals("R") ?
							"!Draw <<Rock equals Rock>>":
					playChoice.equals("P") ?
							"!Player Wins <<Paper covers Rock>>":
					playChoice.equals("S") ?
							"!Computer Wins <<Rock breaks Scissors>>":"":
				compChoice.equals("P") ? 
					playChoice.equals("R") ?
							"!Computer Wins <<Paper covers Rock>>":
					playChoice.equals("P") ?
							"!Draw <<Paper equals Paper>>":
					playChoice.equals("S") ?
							"!Player Wins <<Scissors cut Paper>>":"":
				compChoice.equals("S") ? 
					playChoice.equals("R") ?
							"!Player Wins <<Rock breaks Scissors>>":
					playChoice.equals("P") ?
							"!Computer Wins <<Scissors cut Paper>>":
					playChoice.equals("S") ?
							"!Draw <<Scissors equal Scissors>>":"":""
;
		
		
	}

	public String toString()
	{
		String output="";
		String result = determineWinner();
		output += "player had " + playChoice + "\n";
		output += "computer had " + compChoice + "\n";
		output += result + "\n";
		return output;
	}
}