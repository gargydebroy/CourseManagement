package CourseManagement;

public class Teacher {
	private int id;
	private String name;
	CourseDetails[] coursedetails = new CourseDetails[20];
	public Teacher(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CourseDetails[] getCoursedetails() {
		return coursedetails;
	}
	public void setCoursedetails(CourseDetails[] coursedetails) {
		this.coursedetails = coursedetails;
	}
	
	
	
	
	
	

}
