package CourseManagement;
import java.util.Scanner;

import CourseManagement.Deactivate.*;
public class DeactivateDetailsOperation {
	static CourseDetails[] deactivate = new CourseDetails[10];
	static int dindex=0;
	static Scanner sc = new Scanner(System.in);
	
	static int tempIndex = 0;

	static void addDeactivateCourse(CourseDetails deactivecoursedetail)
	{
		deactivate[dindex++] = deactivecoursedetail;
		//index++; //1  2
		System.out.println("Deactive Course added successfully!!!!");
	}
	
	
	
}

