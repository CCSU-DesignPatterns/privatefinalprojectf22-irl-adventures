package irlpackage;
import java.util.Scanner;
import character.Character;
import character.Caretaker;
import userinterface.CharacterScreen;

/**
 * @author Sean Steben
 * Driver creates grabs an instance of player, creates a new instance of day and an observer
 */


public class Driver {

	public static void main(String[] args) {
		
		Character player = Character.getInstance();
		Caretaker ct = new Caretaker();
		Scanner scan = new Scanner(System.in);
		
		if (!ct.isFirstGame()) {
			ct.loadFromFile();
		}else {
			System.out.println("What is your name? ");
			player.changeName(scan.next());
		}

		CharacterScreen gui = new CharacterScreen(player);
		
		PlayerDay myDay = new PlayerDay();
		new RandomEventObserver(myDay);

		int dayCount;
		System.out.println("Hello! Welcome to IRL Adventures!  \n" + 
							"Please enter game length(in days)");
		dayCount = scan.nextInt();
		for(int i = 1; i <= dayCount; i++)
		{
			char cont = 'y', saveChoice = 'y';
			while(cont == 'y' && player.getTime()!= 0){
			
				myDay.goAboutDay(player);

				System.out.println("Continue(y/n)" );
				cont = scan.next().charAt(0);
			}//end of day here
			player.resetTime();
			System.out.println("You've reached the end of the day!");
			System.out.println("Would you like to save? (y/n)");
			saveChoice = scan.next().charAt(0);
			if(saveChoice == 'y')
			{
				player.save();
				ct.saveToFile();
			}
			
		}//end of game here
		System.out.println("You've reached the end of the game!");

	}

}
