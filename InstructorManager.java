
public class InstructorManager extends UserManager{

	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getInstructorCourse()+
				" kursuna, "+
				instructor.getUserName()+
				"  e�itmeni eklendi.");
	}

}
