package finalProjectfirst;

public class TaskWindowCreator extends SubWindowCreator{
	public TaskWindowCreator(String stat) {
		this.create(stat);
	}
	
	public Task_Window create(String stat) {
		Task_Window hi = new Task_Window(stat);
		return hi;

	}

}
