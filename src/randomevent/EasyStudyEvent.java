package randomevent;
import character.Character;

/**
 * Creates an easy event that checks the character's intelligence and wisdom stats.  Levels the character up if the stats are high enough.
 * @author Dylan
 *
 */

public class EasyStudyEvent implements Event{
	
	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.print("You forgot about an assignment due tomorrow. Get it done quick!");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up!");
			player.levelUp();
		} else {
			System.out.println("Skill check failed :( Better luck next time.\n");
		}
	}
	
	//Checks if character passes SkillCheck
	public boolean isPassed() {
		if (player.getIntel() > 20 && player.getWis() > 20) {
			return true;
		}
		return false;
	}
}
