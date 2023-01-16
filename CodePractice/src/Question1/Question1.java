package Question1;
import java.util.ArrayList;
import java.util.Scanner;

//Dear Participant,
//Coding Challenge
//Kindly go through the problem statement given below carefully and attempt the Challenge and
//Please submit if you want us to review
//Thanks,
//Program Office.
//# Todo Manager Sprint 2
//## Problem Statement
//Todo Manager is an application which can Manage our Tasks and keep track of our Tasks. In the
//Course of 3 week we will be creating a Todo manager.
//## User Stories
//1. As a user I should be able to update the task object in the array
//2. As a user I should be able to delete the task object in the array
//3. As a user I should be able to search a task object from an array
//## Instructions:-
//1. Please use simple system.out.println to print the name
//2. Please create a menu driven application to do all the task,
//System.out.println("*****Menu******");
//System.out.println("Adding a new task");
//System.out.println("Updating a new task");
//System.out.println("Deleting a new Task");
//System.out.println("Searching a new task");
//Please enter your choice!
//3. Please create a Task bean with two property taskId, TaskName and getter/setter
//2. Please use arrays to store the task objects
//3. Please use max array functions to perform the above tasks
//4. The application can be exited only if user enters 0 to exit
//5. Estimated completion time of the challenge will be 2hr.
//6. Make sure you are uploading the code into git and giving the github repository to your mentor.
public class Question1 {
	public static void main(String[] args) {
		int choice;
		ArrayList <Task> taskList = new ArrayList<Task>();
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("*****Menu******");
		System.out.println("Enters 1,Adding a new task");
		System.out.println("Enters 2,Updating a new task");
		System.out.println("Enters 3,Deleting a new Task");
		System.out.println("Enters 4,Searching a new task");
		System.out.println("Enters 0 to exit");
		System.out.println();
		System.out.println("Please enter your choice!");
		choice = scan.nextInt();
		
		switch(choice) {
			case 1:{
					Task temp = new Task();
					System.out.println("Please enter task id");
					int id = scan.nextInt();
					temp.setTaskId(id);
					System.out.println("Please enter task name");
					String name = scan.next();
					temp.setTaskName(name);
					taskList.add(temp);
					System.out.println(name + " is added to task List");
				
				
				break;
				
			}			
						
			case 2: {
				System.out.println("Update, please enter ID");
				int index = scan.nextInt();
				boolean flag = false;
				for(Task i: taskList) {
					if(i.getTaskId() == index) {
						flag = true;
						String name;
						System.out.println("Update, please enter name");
						name = scan.next();
						i.setTaskName(name);
					}
					
				}
				if(flag)
					System.out.println("Task name updated");
				else
					System.out.println("Task not found");
				System.out.println();
				break;
				
				
			}
			case 3: {
				System.out.println("Delete, please enter ID");
				boolean flag = false;
				int index = scan.nextInt();
				for(Task i: taskList) {
					if(i.getTaskId() == index) {
						flag = true;
						taskList.remove(i);
						break;
					}
					
				}
				if(flag)
					System.out.println("Task ID" + index + "deleted");
				else
					System.out.println("Task not found");
				System.out.println();
				
				break;
			}
			case 4: {
				System.out.println("Search, please enter ID");
				int index = scan.nextInt();
				boolean flag = false;
				for(Task i: taskList) {
					if(i.getTaskId() == index) {
						flag = true;
						System.out.println(i.toString());
						break;
					}
					
				}
				if(!flag)
					System.out.println("Task not found!");
				System.out.println();
				break;
				
			}
			case 0 :{
				System.out.println("Bye");
				break;
			}
			
			
		}
		
	}while(choice != 0);
	
		scan.close();
	}
	
}