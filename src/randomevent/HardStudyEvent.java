package randomevent;
import character.Character;

/**
 * Creates a hard event that checks the character's intelligence and wisdom stats. Levels the character up if the stats are high enough.
 * @author Dylan
 *
 */

public class HardStudyEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.println("Finish the New York Times crossword in pen.");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up!\n");
			player.levelUp();
		} else {
			System.out.println("Skill check failed :( Better luck next time.\n");
		}
	}
	
	public boolean isPassed() {
		if (player.getIntel() > 50 && player.getWis() > 50) {
			return true;
		}
		return false;
	}
}
