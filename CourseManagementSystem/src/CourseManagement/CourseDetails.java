package CourseManagement;
import java.util.Scanner;


public class CourseDetails {
	
	String name;
	int cid;
	//one course can have many student
	StudentDetails[] studentdetails = new StudentDetails[20];
	Teacher[] teacherdetails = new Teacher[10];
	Deactivate[] deactivate = new Deactivate[10];
	public CourseDetails(int cid, String name)
	{
		super();
		this.cid = cid;
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public StudentDetails[] getStudentdetails() {
		return studentdetails;
	}
	public void setStudentdetails(StudentDetails[] studentdetails) {
		this.studentdetails = studentdetails;
	}
	public Teacher[] getTeacherdetails() {
		return teacherdetails;
	}
	public void setTeacherdetails(Teacher[] teacherdetails) {
		this.teacherdetails = teacherdetails;
	}
	public Deactivate[] getDeactivate() {
		return deactivate;
	}
	public void setDeactivate(Deactivate[] deactivate) {
		this.deactivate = deactivate;
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void addCourse()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("How many Course you want to add");
		size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
		System.out.println("Enter course name:");
		name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter course id:");
		cid=sc.nextInt();
		}
	}
	public void displayCourse()
	{
		for(int i=0;i<size;i++)
		System.out.println("course Name: "+name+"course Id: "+cid);
	}

}*/
