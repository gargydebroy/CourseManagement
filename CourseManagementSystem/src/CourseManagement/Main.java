package CourseManagement;
import static CourseManagement.Login.*;
import static CourseManagement.Admin.*;
import java.util.Scanner;
public  class Main {
	public static void allDetails()
	{
	
		int choice;
		while(true) {
			System.out.println("=================================");
			System.out.println("Press 1.Admin Panel\nPress 2.User Panel\n"+ "Press 3 for quit");
			System.out.println("=================================");
			System.out.println("Enter your choice!");
			
			System.out.println("==========================");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				adminOperations();
				System.out.println("==========================");
				break;
			case 2:
				break;
			case 3:
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("~~~~~Welcome to our Course Details page~~~~~");
		loginAccess();
		
	}
}

	