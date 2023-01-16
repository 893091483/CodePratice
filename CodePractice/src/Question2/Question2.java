package Question2;
import java.util.*;

import Question1.Task;
//Dear Participant,
//Coding Challenge day 1
//Kindly go through the problem statement given below carefully and attempt the Challenge and
//Please submit if you want us to review
//Thanks,
//Program Office.
//## Problem Statement
//Todo Manager is an application which can Manage our Tasks and keep track of our Tasks. In the
//course of 3 week we will be creating a Todo manager.
//## User Stories
//1. As a user I should be able to print my name on the screen
//2. As a user I should be able to input at least 3 tasks for the day.
//3. As a user I should be able to see all the tasks in increasing and decreasing order.
//4. As a user I should be able to see the repeated tasks.
//## Instructions:-
//1. Please use simple system.out.println to print the name
//2. Please use simple variables to store all tasks (do not use array)
//3. Please use simple if else to arrange the task in an order
//4. Please use if else to check the repeated tasks
//5. Estimated completion time of the challenge will be 2hr.
//6- Upload project in github and share the repository link with the mentor
public class Question2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.next();
		System.out.println(" Welcome "+ name + " !");
		
		System.out.println();
		
		String t1;
		String t2;
		String t3;
		
		
		System.out.println("Please enter name for task 1: ");
		t1 = scan.next();
		System.out.println(t1 + " is added");
		
		System.out.println("Please enter name for task 2: ");
		t2 = scan.next();
		System.out.println(t2 + " is added");
		
		System.out.println("Please enter name for task 3: ");
		t3 = scan.next();
		System.out.println(t3 + " is added");
		
		char n1 = t1.charAt(0);
		char n2 = t2.charAt(0);
		char n3 = t3.charAt(0);
		
		
		if(n1> n2 && n1 > n3) {
			if(n2>n3) {
				System.out.println("Tasks: " + t1 + " " + t2 + " " +t3);
				
			}
			else {
				System.out.println("Tasks: " + t1 + " " + t3 + " " +t2);
				
			}
		}
		
		if(n2> n1 && n2 > n3) {
			if(n1>n3) {
				System.out.println("Tasks: " + t2 + " " + t1 + " " +t3);
				
			}
			else {
				System.out.println("Tasks: " + t2 + " " + t3 + " " +t1);
			
			}
		}
		
		if(n3> n1 && n3 > n2) {
			if(n1>n2) 
				System.out.println("Tasks: " + t3 + " " + t1 + " " +t2);
			
			else {
				System.out.println("Tasks: " + t3 + " " + t2 + " " +t1);
				
			}
		}
		System.out.println();
		
		if(t1.equalsIgnoreCase(t3) || t1.equalsIgnoreCase(t2))
			System.out.println(t1 + " is repeated");
		else{
			if(t2.equalsIgnoreCase(t3) )
			System.out.println(t2 + " is repeated");
			else
				System.out.println("no repeated task");
	
		}
			
		
		}
		
	}
	
	


