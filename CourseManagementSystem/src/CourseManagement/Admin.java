package CourseManagement;
import static CourseManagement.StudentDetailsOperatins.*;
import static CourseManagement.CourseDetailOperations.*;
import java.util.Scanner;
import static CourseManagement.BatchDetailsOperation.*;
import static CourseManagement.TeacherDetailsOperations.*;
import static CourseManagement.Main.*;
import static CourseManagement.Batch.*;

//add,update and delete details
public class Admin {
	static Scanner sc = new Scanner(System.in);
	static CourseDetails createCourse()
	{
		System.out.println("Enter Course Id : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Course Name : ");
		String name = sc.nextLine();
		
		return new CourseDetails(id, name);   //returning course object
	}
	
	static StudentDetails createStudent()
	{
		System.out.println("Enter Student Id : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Address : ");
		String address = sc.nextLine();
		//System.out.println("Enter Student Batch : ");
		//double batch = sc.nextInt();
		
		return new StudentDetails(id, name, address);   //returning student object
	}
	static Teacher createteacher()
	{
		System.out.println("Enter Teacher Id : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Teacher Name : ");
		String name = sc.nextLine();
		
		
		
		return new Teacher(id, name);   //returning teacher object
	}
	
	
	static Batch createBatch()
	{
		System.out.println("Enter the Batch : ");
		double year= sc.nextInt();
		return new Batch(year);
	}
	static void checkSyllabus()
	{
		
	}





static void adminOperations()
{
	int choice;
	
	while(true)
	{
		System.out.println("=========================================");
		
		System.out.println("Press 1.Add Course\n" 
		                 + "Press 2.Add Batch(year)\n" 
		                 + "Press 3.Add Teacher\n"
				         + "Press 4.Add Student\n"
				         + "Press 5.Get All Course Details\n"
				         + "Press 6.Get all Student Details\n"
				         + "press 7.Get all Teacher Details\n"
				         + "Press 8.Assign Student to Course\n"
				         + "Press 9.Assign Teacher to Course\n"
				         + "press 10 Assign Student to Batch\n"
				         + "press 11.Get all Batch Details\n\""
				         + "Press 12.Deactivate The course\n\""
				         + "press 13.For getting back to the main\n");
		
		System.out.println("=========================================");
		System.out.println("Enter your choice!!");
		
		System.out.println("=========================================");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				CourseDetails c = createCourse();
				addCourse(c);
				System.out.println("=======================================");
				break;
			
			case 2:
				Batch b=createBatch();
				addBatch( b);
				System.out.println("=======================================");
				break;
				
			case 3:
				Teacher t=createteacher();
				addTeacher(t);
				System.out.println("=======================================");
				break;
				
			case 4:
				StudentDetails s = createStudent();
			    addStudent(s);
			    System.out.println("=======================================");
			       break;
			
			case 5:
				getAllCourse();
				System.out.println("=======================================");
			       break;
			       
			case 6:
				getAllStudents();
				System.out.println("=======================================");
			       break;
			       
			case 7:getAllTeacher();
			       System.out.println("=======================================");
			       break;
			       
			case 8:assignstudentToCourse();
			       System.out.println("=======================================");
			       break;
			       
			case 9:assignTeacherToCourse();
				   System.out.println("=======================================");
			       break;
			case 10:
				assignStudentToBatch();
				System.out.println("=======================================");
				break;
				
			case 11:
				getAllBatch();
				break;
			case 12:deactivate();
		       System.out.println("=======================================");
		       break;
			case 13:allDetails();
			       System.out.println("=======================================");
			       break;
		}
	}
}
}

		
		
		
