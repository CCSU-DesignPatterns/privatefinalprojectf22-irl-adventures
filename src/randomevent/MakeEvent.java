package randomevent;
import java.util.Random;

/**
 * Creates a different event factory based off of the character's level.
 * @author Dylan
 *
 */

public class MakeEvent {

	public static AbstractFactory getFactory(int level) {
		if(level < 10) {
			return new EasyEventFactory();
		} else if(level < 25) {
			return new MediumEventFactory();
		} else {
			return new HardEventFactory();
		}
	}
}
