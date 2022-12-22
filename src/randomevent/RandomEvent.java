package randomevent;
import java.util.Random;

import irlpackage.*;
import normalday.*;
import character.Character;
/**
 * 
 * @author Sean, Dylan
 * Random Event is a class the starter of a random obstacle that happens during the players day
 *
 */
public class RandomEvent{

	public void startRand(Character player) {
		
		int level = player.getLevel();
		Random rand = new Random();
		int type = rand.nextInt(3);
		
		System.out.println("A random event happened!");//tester output
		
		AbstractFactory eventFactory;
		try {
			eventFactory = MakeEvent.getFactory(level);
			Event event = eventFactory.getEvent(type);
			event.skillCheck();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
