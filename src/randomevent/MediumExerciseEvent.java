package randomevent;
import character.Character;

public class MediumExerciseEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.println("Your friend needs help moving a couch. Help him out.");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up!");
			player.levelUp();
		} else {
			System.out.println("Better luck next time.");
		}
	}
	
	public boolean isPassed() {
		if (player.getStr() > 30 && player.getDex() > 30 && player.getCon() > 30) {
			return true;
		}
		return false;
	}
}
