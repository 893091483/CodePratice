package Question1;
public class Task {
	
	private String taskName;
	private int taskId;
	public Task() {
		// TODO Auto-generated constructor stub
	}
	public Task(String taskName,int taskId) {
		this.taskId = taskId;
		this.taskName = taskName;
		// TODO Auto-generated constructor stub
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}              
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	} 
	public int getTaskId() {
		return taskId;
	} 
	
	public String getTaskName() {
		return taskName;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + "]";
	}
}


