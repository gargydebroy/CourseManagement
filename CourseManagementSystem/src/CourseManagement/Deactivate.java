package CourseManagement;

public class Deactivate {
	private String dname;
	private int did;
	static StudentDetails[] studentdetails = new StudentDetails[10];
	Deactivate(String dname,int did)
	{
		super();
		this.dname=dname;
		this.did=did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public static StudentDetails[] getStudentdetails() {
		return studentdetails;
	}
	public static void setStudentdetails(StudentDetails[] studentdetails) {
		Deactivate.studentdetails = studentdetails;
	}
	

}
