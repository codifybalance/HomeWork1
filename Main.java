

public class Main {

	public static void main(String[] args) {
		// User, Instructor, Student (Class-Inheritance)
		//UserManager, InstructorManager, StudentManager (Class-Inheritance-Method)
		
		Instructor instructor = new Instructor();

		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setUserName("enginuser");
		instructor.setEmail("engin@gmail");
		instructor.setPassword("122222");	
		instructor.setInstructorId("1");
		instructor.setInstructorCourse("Java&React Kursu");
		
		Student student = new Student();
		
	
		student.setLastName("Aydemir");
		student.setUserName("aycauser");
		student.setPassword("444444");	
		student.setStudentId("1");
		student.setRegisteredCourse("Java&React Kursu ");
		

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor);
		 
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student);
		
		commonFunctionsUI commonFunctionsUI = new commonFunctionsUI();
		commonFunctionsUI.Hesaplama(new InstructorManager());
		
	}

}
