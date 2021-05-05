
public class Instructor extends User{
	private String instructorId;
	private String instructorCourse;
	
	public Instructor() {
		
	}
	
	public Instructor(String firstName, String lastName, String userName,String password,String email,String instructorId,String instructorCourse) {
		this.instructorId = instructorId;
		this.instructorCourse = instructorCourse;
    }
	
	public String getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}
	public String getInstructorCourse() {
		return instructorCourse;
	}
	public void setInstructorCourse(String instructorCourse) {
		this.instructorCourse = instructorCourse;
	}
}
