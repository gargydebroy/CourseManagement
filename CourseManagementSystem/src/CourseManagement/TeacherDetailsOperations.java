package CourseManagement;
import static CourseManagement.CourseDetailOperations.*;
import static CourseManagement.CourseDetails.*;

import java.util.Scanner;
public class TeacherDetailsOperations {
            static Teacher[] teacherdetails = new Teacher[10];
			static int tindex=0;
			static Scanner sc = new Scanner(System.in);
			
			static int tempIndex = 0;
			
			//will add staff object in the array
			static void addTeacher(Teacher teacherdetail)
			{
				teacherdetails[tindex++] = teacherdetail;
				
				System.out.println("Teacher added successfully!!!!");
			

	}
			static void getAllTeacher()
			{
				for(int i=0; i<tindex; i++)    //index=0
				{
					System.out.println("Teacher Id : "+teacherdetails[i].getId());  
					System.out.println("Teacher Name : "+teacherdetails[i].getName());   
					   
				}
			}
			
			
			static Teacher checkteacher(int tid)
			{
				for(int i=0; i<tindex; i++)  
				{
					if(teacherdetails[i].getId()==tid)  
					{
						return teacherdetails[i];  
					}
				}
				return null;
			}
			
			static void assignTeacherToCourse()
			{
				boolean status=false;
				System.out.println("Enter Course Id : ");
				int Cid = sc.nextInt();    //1
				
				for(int i=0;i<cindex;i++) {
					 
					 if( coursedetails[i].getCid()==Cid){
						 System.out.println("Enter how many Students you want to add");
						 int size=sc.nextInt();
						
						 Teacher[] temptech=new Teacher[5];
						
						for(int j=0;j<size;j++) {
							
						 
							System.out.println("Enter Teacher Id ");
							int sid = sc.nextInt();
							Teacher t = checkteacher(sid);
							if(t !=null)
								temptech[tempIndex++]=t;
							else
								System.out.println("teacher id is not available");
						}//end of j loop
							
						coursedetails[i].setTeacherdetails(temptech);
							System.out.println(" added sucessfully!!");
							status=true;
							break;
						
						}//end of external if
						
				 }//for end
			}

}
