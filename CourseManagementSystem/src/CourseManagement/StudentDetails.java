package CourseManagement;

public class StudentDetails {
	private int sid;
	private String  sname;
	private String address;
	//double batchh;
	CourseDetails[] coursedetails = new CourseDetails[20];
	Batch [] batch=new Batch[10];
	Deactivate[] deactivate = new Deactivate[10];
    StudentDetails(int sid,String sname,String address)
	{
    	super();
    	this.sid=sid;
    	this.sname=sname;
    	this.address=address;
    	//this.batchh=batchh;
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CourseDetails[] getCoursedetails() {
		return coursedetails;
	}
	public void setCoursedetails(CourseDetails[] coursedetails) {
		this.coursedetails = coursedetails;
	}
	public Batch[] getBatch() {
		return batch;
	}
	public void setBatch(Batch[] batch) {
		this.batch = batch;
	}
	public Deactivate[] getDeactivate() {
		return deactivate;
	}
	public void setDeactivate(Deactivate[] deactivate) {
		this.deactivate = deactivate;
	}
	
	
	
	
    

}
