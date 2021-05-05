
public class StudentManager extends UserManager{
	
	public void addStudent(Student student) {
		System.out.println(student.getRegisteredCourse()+
				" kursuna ,"+
				student.getUserName()+
				"  öğrencisi eklendi.");
	}

}

