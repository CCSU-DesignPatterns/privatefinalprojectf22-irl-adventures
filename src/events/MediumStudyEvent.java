package events;

import character.Character;

public class MediumStudyEvent {

	Character player = Character.getInstance();
	
	public void skillCheck() {
		//System.out.print("Add scenario here");
		if (isPassed()) {
			System.out.println("Skillcheck Passed!");
			//add level up method here.
		} else {
			System.out.println("Better luck next time.");
		}
	}
	
	public boolean isPassed() {
		if (player.getIntel() > 30 && player.getWis() > 30) {
			return true;
		}
		return false;
	}
}