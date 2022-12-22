package userinterface;

public class TaskSubmitionCreator extends SubWindowCreator{
	public TaskSubmitionCreator(String task) {
		this.create(task);
	}
	
	public TaskSubmition create(String task) {
		TaskSubmition hi = new TaskSubmition(task);
		return hi;

	}

}