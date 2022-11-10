package RandomEvent;

/**
 * Creates one of three easy difficulty events depending on the integer passed into them.
 * @author Dylan
 *
 */

public class EasyEventFactory extends AbstractFactory{
	
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