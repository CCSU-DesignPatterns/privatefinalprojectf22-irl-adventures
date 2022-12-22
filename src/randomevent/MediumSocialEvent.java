package randomevent;
import character.Character;

/**
 * Creates a medium event that checks the character's charisma and kindness stats. Levels the character up if the stats are high enough.
 * @author Dylan
 *
 */

public class MediumSocialEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.println("You're up next for karaoke. Go sing your heart out.");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up!\n");
			player.levelUp();
		} else {
			System.out.println("Skillcheck failed :( Better luck next time.\n");
		}
	}
	
	public boolean isPassed() {
		if (player.getChr() > 30 && player.getKnd() > 30) {
			return true;
		}
		return false;
	}
}
