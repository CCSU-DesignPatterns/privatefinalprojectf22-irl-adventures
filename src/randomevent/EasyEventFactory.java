package randomevent;

/**
 * Creates easy events based off of the integer passed into the getEvent method call. Used by MakeEvent class, getEvent is called in RandomEvent class.
 * @author Dylan
 *
 */

public class EasyEventFactory implements AbstractFactory{
	
	public EasyEventFactory() {
		
	}
	
	public Event getEvent(int type){
		if (type == 0) {
			return (Event) new EasyExerciseEvent();
		} else if (type == 1) {
			return (Event) new EasySocialEvent();
		} else if (type == 2) {
			return (Event) new EasyStudyEvent();
		} else {
			return null;
		}
	}
	
}
