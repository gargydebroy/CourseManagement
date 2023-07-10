package CourseManagement;

import static CourseManagement.CourseDetailOperations.coursedetails;
import static CourseManagement.StudentDetailsOperatins.*;

import java.util.Scanner;

public class BatchDetailsOperation {
	static Batch[] batch = new Batch[10];
	static int bindex=0;
	static Scanner sc = new Scanner(System.in);
	
	static int tempIndex = 0;
	
	//will add student object in the array
	static void addBatch(Batch batchh)
	{
		batch[bindex++] = batchh;
		
		System.out.println("Batch added successfully!!!!");
	}
	static void getAllBatch()
	{
	for(int i=0;i<bindex;i++)
	{
		System.out.println("Batch year : "+batch[i].getYear());  
	
		 
	for(int j=0;j<batch[i].getStudentdetails().length;j++) {
		StudentDetails[] s = batch[i].getStudentdetails();
		 
		 if(s[j]==(null)) {
			 continue;
		 }
		 else {
			 System.out.println("=========================");
			 System.out.println("Student Id: "+s[j].getSid());
			 System.out.println("Student Name: "+s[j].getSname());
			 System.out.println("Student Address: "+s[j].getAddress());
			 //System.out.println("Student Batchs: "+s[j].getBatch());
			 System.out.println("=========================");
		
		 }
		 }//else end
	}
			 
}
	
	static StudentDetails checkstudent(int Sid)
	{
		for(int i=0; i<sindex; i++)  
		{
			if(studentdetails[i].getSid()==Sid)  
			{
				
					return studentdetails[i]; 
					
			
			}
			
		}
		return null;
	}
	


static void assignStudentToBatch()
{
	boolean status=false;
	System.out.println("Enter Batch year : ");
	double year = sc.nextInt();    //1
	
	for(int i=0;i<bindex;i++) {
		 
		 if( batch[i].getYear()==year){
			 System.out.println("Enter how many Students you want to add a particular Batch");
			 int size=sc.nextInt();
			
			 StudentDetails[] tempstu=new StudentDetails[5];
			
			for(int j=0;j<size;j++) {
				
			 
				System.out.println("Enter Student Id ");
				int sid = sc.nextInt();
				StudentDetails s = checkstudent(sid);
				if(s==null)
					System.out.println("Student id is not available");
					
				else
					tempstu[tempIndex++]=s;
			}//end of j loop
				
			batch[i].setStudentdetails(tempstu);
				System.out.println(" added sucessfully!!");
				status=true;
				break;
			
			}//end of external if
			
	 }//for end
}


}


