
public class Student extends User{
	private String studentId;
	private String registeredCourse;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName,String userName, String password, String email,String studentId,String registeredCourse) {
		this.studentId = studentId;
		this.registeredCourse = registeredCourse;
		
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getRegisteredCourse() {
		return registeredCourse;
	}
	public void setRegisteredCourse(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}
	

}
