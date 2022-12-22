package normalday;
import irlpackage.*;

import java.util.Scanner;

import character.Character;
/*@Sean Steben
Daily Task is an abstract class that provides common functionality for it's child classes events. The template method provides a hook
for the child classes to use. Each child class provides their own implementation of update as they will be updating different statistics*/
public abstract class DailyTask {
	protected int xp;
	protected int time;
	 protected void calcTime(Character myPlayer, int inputState)
	 {
		
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("How long would you like to this activity for?(in minutes)");
			while(!scan.hasNextInt()) //validate its a number
			{
				System.out.println("Please enter a number");
				scan.next();
			}
			time = scan.nextInt();
			if(time > myPlayer.getTime())
				System.out.println("You only have " + myPlayer.getTime() + " minutes left!");
		}while(time > myPlayer.getTime() || time < 0);//validate enough time and positive number
		
		if(inputState == 1)
			xp = time / 5;  //for every 5 minutes of activity, +1 in related stats
		if(inputState == 2)
			xp = time / 10;//for every 10 minutes of activity, +1 in related stats
		if(inputState  ==  3)
			xp = time / 15;//for every 15 minutes of activity, +1 in related stats
		
			
	 }
	 protected void showResults()
	 {
		 System.out.println("You've earned "+ xp + " xp!");
		 
	 }
	 /*Each activity will update character stats differently so each activity will implement
	  * their own version of updateChar*/
	 abstract void updateChar(Character myPlayer);
	 public void doActivity(Character myPlayer, int inputState)//template method
	 {
		calcTime(myPlayer,inputState);
		showResults();
		updateChar(myPlayer);
		myPlayer.removeTime(time);
	 }
	

}
