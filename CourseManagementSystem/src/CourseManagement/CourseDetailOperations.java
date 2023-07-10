package CourseManagement;
import CourseManagement.StudentDetails.*;



import java.util.Scanner;

import static CourseManagement.DeactivateDetailsOperation.*;
//Where we can do AddCourse,deleteCourse,getallCourse
public class CourseDetailOperations {
	
		static CourseDetails[] coursedetails = new CourseDetails[10];
		static int cindex=0;
		static Scanner sc = new Scanner(System.in);
		
		static int tempIndex = 0;
		
		//will add menu object in the array
		static void addCourse(CourseDetails coursedetail)
		{
			coursedetails[cindex++] = coursedetail;
			//index++; //1  2
			System.out.println("Course added successfully!!!!");
		}
		static void Syllabus() {
			System.out.println("1.Full stack Java development"
					+ "2.DBMS"
					+ "3.Data Structure");
		}
		
		static void getAllCourse()
		{
			for(int i=0; i<cindex; i++)    //index=0
			{
				for(int j=0;j<dindex;j++)
				{
					if( deactivate[i]==null)
					{
					
						continue;
						
						
					}
					else if(coursedetails[i].getCid()==deactivate[j].getCid())
					{
						System.out.println("Deactivate this Course:");
					}
					else
					{
						continue;
					}
					
				}
				System.out.println("Course Id : "+coursedetails[i].getCid());  
				System.out.println("Course Name : "+coursedetails[i].getName());   
			
			
			for(int j=0;j<coursedetails[i].getStudentdetails().length;j++) {
				StudentDetails[] s = coursedetails[i].getStudentdetails();
				 
				 if(s[j]==(null)) {
					 continue;
				 }
				 else {
					 System.out.println("=========================");
					 System.out.println("Student Id: "+s[j].getSid());
					 System.out.println("Student Name: "+s[j].getSname());
					 System.out.println("Student Address: "+s[j].getAddress());
					 
					 System.out.println("=========================");
				 }//else end
					 
			 
			
			for(int k=0;k<coursedetails[i].getTeacherdetails().length;k++) {
				Teacher[] t = coursedetails[i].getTeacherdetails();
				 
				 if(t[k]==(null)) {
					 continue;
				 }
				 else {
					 System.out.println("=========================");
					 System.out.println("Teacher Id: "+t[k].getId());
					 System.out.println("Teacher name Name: "+t[k].getName());
					 
					 System.out.println("=========================");
				 }//else end
					 
			 }//inner for loop
			
		}

}
		}
}
