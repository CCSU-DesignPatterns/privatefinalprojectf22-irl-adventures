package randomevent;
import character.Character;

public class EasyExerciseEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.println("You're running late for class! Sprint across campus to make it in time.");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up!");
			player.levelUp();
		} else {
			System.out.println("Skill check failed :( Better luck next time.\n");
		}
	}
	
	public boolean isPassed() {
		if (player.getStr() > 20 && player.getDex() > 20 && player.getCon() > 20) {
			return true;
		}
		return false;
	}
}
