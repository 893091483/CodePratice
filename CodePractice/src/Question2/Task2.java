package Question2;

public class Task2 {
	
	private String taskName;
	private int taskCount;
	public Task2() {
		// TODO Auto-generated constructor stub
	}
	public Task2(String taskName,int taskCount) {
		this.taskCount = taskCount;
		this.taskName = taskName;
		// TODO Auto-generated constructor stub
	}
	public void setTaskCount(int taskCount) {
		this.taskCount = taskCount;
	}              
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	} 
	public int getTaskCount() {
		return taskCount;
	} 
	
	public String getTaskName() {
		return taskName;
	}
	@Override
	public String toString() {
		return "Task [taskCount=" + taskCount + ", taskName=" + taskName + "]";
	}
}