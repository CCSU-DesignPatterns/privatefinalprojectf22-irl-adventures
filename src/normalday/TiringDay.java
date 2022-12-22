package normalday;
import irlpackage.*;
import randomevent.RandomEvent;
import java.util.Scanner;
import character.Character;
import java.util.Random;
/**
 * 
 * @author Sean Steben
 * TiringDay is the state of which the character performs tired and exhausted. They receive less XP than normal  for completing tasks in this state
 *
 */
public class TiringDay implements DayState {
	int thisState = 3;
	/**
	 * method is the framework the day to day activity tracking in a tired mood. implements the tasks as needed, starts the random events if they occur
	 */
	public void goAboutDay(Character player, PlayerDay currentDay) {
		
		int choice;

			System.out.println("This is a tiring day!");
			System.out.println("Your current stats: " + "\n" + 
					"Strength: " + player.getStr() + "\n" +
					"Dexterity: " + player.getDex() + "\n" +
					"Intelligence: " + player.getIntel() + "\n" +
					"Wisdom: " + player.getWis() + "\n" +
					"Charisma: " + player.getChr() + "\n" +
					"Constituion: " + player.getCon() + "\n" +
					"Kindness: " + player.getKnd()+ "\n");
			Random r = new Random();
			if(r.nextInt(10)  == 0 && player.getTime() >= 30)//match random and do not trigger if less than 30 minutes
			{
				System.out.println("Random Event Triggered");//tester text
				RandomEvent rand = new RandomEvent();
				rand.startRand(player);
				currentDay.notifyObservers();
				player.removeTime(30);//random Event takes up 30 minutes
			}
			Scanner scan = new Scanner(System.in);
			do
			{
				System.out.println("What activity would you like to do?"+ "\n" +
						"1) Exercise" + "\n" +
						"2) Study" + "\n" + 
						"3) Socialize" + "\n");
				while(!scan.hasNextInt()) 
				{
					System.out.println("Please enter a number");
					scan.next();
				}
				choice = scan.nextInt();
			}while(choice<1 || choice>4);
			if(choice == 1) {
				Exercise ex = new Exercise();
				ex.doActivity(player,thisState);
			}
			if(choice == 2) {
				Study st = new Study();
				st.doActivity(player,thisState);
			}
			if(choice == 3) {
				Socialize soc = new Socialize();
				soc.doActivity(player,thisState);
			}
			
			//tester option to start random event
			if(choice == 4)
			{
				System.out.println("Random Event Triggered");
				RandomEvent rand = new RandomEvent();
				rand.startRand(player);
				currentDay.notifyObservers();
				
				
			}
	 }

	
}
