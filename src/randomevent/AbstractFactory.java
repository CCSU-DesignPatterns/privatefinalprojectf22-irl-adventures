package randomevent;

/**
 * Interface for creating the various factories that create the random events.
 * 
 * @author Dylan
 *
 */

public interface AbstractFactory {
	
	abstract Event getEvent(int type);
	
}
