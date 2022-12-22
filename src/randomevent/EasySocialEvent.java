package randomevent;
import character.Character;

/**
 * Creates an easy event that checks the character's charisma and kindness stats. Levels the character up if the stats are high enough.
 * @author Dylan
 *
 */

public class EasySocialEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.println("You are meeting a mutual friend for the first time. Make a good impression!");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up!");
			player.levelUp();
		} else {
			System.out.println("Skill check failed :( Better luck next time.\n");
		}
	}
	
	//Checks if character passes SkillCheck
	public boolean isPassed() {
		if (player.getChr() > 20 && player.getKnd() > 20) {
			return true;
		}
		return false;
	}
}
