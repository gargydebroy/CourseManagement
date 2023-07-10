package CourseManagement;

public class Batch {
	double year;
	StudentDetails[] studentdetails = new StudentDetails[20];
	Batch(double year)
	{
		super();
		this.year=year;
	}
	
	public double getYear() {
		return year;
	}
	public void setYear(double year) {
		this.year = year;
	}

	public StudentDetails[] getStudentdetails() {
		return studentdetails;
	}

	public void setStudentdetails(StudentDetails[] studentdetails) {
		this.studentdetails = studentdetails;
	}
	
	


}
