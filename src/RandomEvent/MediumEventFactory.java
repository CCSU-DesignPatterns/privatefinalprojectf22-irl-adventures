package RandomEvent;


public class MediumEventFactory extends AbstractFactory{

	public MediumEventFactory(int type) {
		
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