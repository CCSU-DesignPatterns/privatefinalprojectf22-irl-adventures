package normalday;

import character.Character;

//@Sean Steben
public class Study extends DailyTask {
	public void updateChar(Character myPlayer)
	{
		myPlayer.addIntel(xp);
		myPlayer.addWis(xp);
		
	}

}
