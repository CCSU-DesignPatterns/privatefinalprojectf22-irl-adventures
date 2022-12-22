package irlpackage;
import normalday.*;
/**
 * 
 * @author Sean Steben
 * This observer receives word of when random events happen. Changes the character's State of day into
 *
 */
public class RandomEventObserver extends Observer {
	private int eventCount  = 0;
	
	public RandomEventObserver(PlayerDay day) {
		this.day = day;
		this.day.attach(this);
	}
	@Override
	public void update() {
		
		eventCount++;
		if(eventCount >2)
		{
			System.out.println("You're not as relaxed as you were...");//tester text for validation
			NormalDay norm = new NormalDay();
			day.setState(norm);
		}
		if(eventCount > 4)
		{
			System.out.println("A lot has happened today! You're now exhausted!");//tester text for validation
			TiringDay tired = new TiringDay();
			day.setState(tired);
		}
		
	}

}
