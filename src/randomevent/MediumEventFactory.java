package randomevent;

/**
 * Creates medium events based off of the integer passed into the getEvent method call. Used by MakeEvent class, getEvent is called in RandomEvent class.
 * @author Dylan
 *
 */

public class MediumEventFactory implements AbstractFactory{

	public MediumEventFactory(){
		
	}
	
	public Event getEvent(int type){
		if (type == 0) {
			return (Event) new MediumExerciseEvent();
		} else if (type == 1) {
			return (Event) new MediumSocialEvent();
		} else if (type == 2) {
			return (Event) new MediumStudyEvent();
		} else {
			return null;
		}
	}
}
