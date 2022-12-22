package randomevent;

/**
 * Creates hard events based off of the integer passed into the getEvent method call. Used by MakeEvent class, getEvent is called in RandomEvent class.
 * @author Dylan
 *
 */

public class HardEventFactory implements AbstractFactory{

	public HardEventFactory() {
		
	}
	
	public Event getEvent(int type){
		if (type == 0) {
			return (Event) new HardExerciseEvent();
		} else if (type == 1) {
			return (Event) new HardSocialEvent();
		} else if (type == 2) {
			return (Event) new HardStudyEvent();
		} else {
			return null;
		}
	}
}
