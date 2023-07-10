package CourseManagement;
import static CourseManagement.TeacherDetailsOperations.*;
import static CourseManagement.CourseDetailOperations.*;
import CourseManagement.StudentDetails.*;
import static CourseManagement.BatchDetailsOperation.*;
import  CourseManagement.Batch.*;
import java.util.Scanner;
import static CourseManagement.Admin.*;
import static CourseManagement.DeactivateDetailsOperation.*;
import CourseManagement.Deactivate.*;
import CourseManagement.*;
public class StudentDetailsOperatins {
	//static Deactivate[] deactivatee = new Deactivate[10];
	
	static StudentDetails[] studentdetails = new StudentDetails[10];
	static Batch[] batch = new Batch[10];
	static int sindex=0;
	static Scanner sc = new Scanner(System.in);
	
	static int tempIndex = 0;
	
	//will add student object in the array
	static void addStudent(StudentDetails studentdetail)
	{
		studentdetails[sindex++] = studentdetail;
		
		System.out.println("Student  added successfully!!!!");
	}
	static void getAllStudents()
	{
		
		for(int i=0; i<sindex; i++)    //index=0
		{
			System.out.println("Student Id : "+studentdetails[i].getSid());  
			System.out.println("Student Name : "+studentdetails[i].getSname());   
			System.out.println("Student Address : "+studentdetails[i].getAddress());   
			
		
			
		}
	}
	
	static StudentDetails checkstudent(int rid)
	{
		for(int i=0; i<sindex; i++)  //  3454  1     4566  2
		{
			if(studentdetails[i].getSid()==rid)  //3454.getId()  1==3 t
			{
				return studentdetails[i];  //return object
			}
		}
		return null;
	}
	static void deactivate() {
		System.out.println("Enter the course id which u want to deactive");
		int id=sc.nextInt();
		
		for(int i=0; i<coursedetails.length; i++)
		{
			if( coursedetails[i].getCid()==id)
			{
				CourseDetails d=coursedetails[i];
				addDeactivateCourse( d);
				System.out.println("NOW the course is Deactivate.");
				break;
				
			}
			
		}
		
	}
	static void assignstudentToCourse()
	{
		boolean status=false;
		System.out.println("Enter Course Id : ");
		int Cid = sc.nextInt();
		
		for(int i=0;i<deactivate.length-1;i++)//1
		{
			if( deactivate[i]==null)
			{
			
				continue;
				
				
			}
			else if( deactivate[i].getCid()==Cid)

			{
				
				System.out.println("NOW the course is Deactivate"
						+ "So Student can not take admission in this course.");
				adminOperations();
			}
			else {
				continue;
			}
		}
		
		for(int i=0;i<cindex;i++) {
			if( coursedetails[i].getCid()==Cid)
			
			 
			{
				 System.out.println("Enter how many Students you want to add");
				 int size=sc.nextInt();
				
				 StudentDetails[] tempstu=new StudentDetails[5];
				
				for(int j=0;j<size;j++) {
					
				 
					System.out.println("Enter Student Id ");
					int sid = sc.nextInt();
					StudentDetails s = checkstudent(sid);
					if(s !=null)
						tempstu[tempIndex++]=s;
					else
						System.out.println("Student id is not available");
				}//end of j loop
					
				coursedetails[i].setStudentdetails(tempstu);
					System.out.println(" added sucessfully!!");
					status=true;
					break;
				
				}//end of external if
				
		 }//for end
	}
	}
	


