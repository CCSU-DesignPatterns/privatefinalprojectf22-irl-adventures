package irlpackage;

import character.Character;

/**
 * DaySate provides blueprint for potential states the game could be in
 * @author Sean Steben
 *
 */
public interface DayState {
	
	

	public void goAboutDay(Character player, PlayerDay currentDay);
	
	

}
