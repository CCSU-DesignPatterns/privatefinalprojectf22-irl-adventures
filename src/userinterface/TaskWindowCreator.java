package userinterface;

public class TaskWindowCreator extends SubWindowCreator{
	public TaskWindowCreator(String stat) {
		this.create(stat);
	}
	
	public TaskWindow create(String stat) {
		TaskWindow hi = new TaskWindow(stat);
		return hi;

	}

}