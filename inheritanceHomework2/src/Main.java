public class Main {

    public static void main(String[] args) {
	// add student name
        Student student = new Student();
        student.fullName ="Betül Bircan";

        //ADD STUDENT COURSE AND UPDATE
        StudentManager studentManager = new StudentManager();
        studentManager.addCourse(student);
        studentManager.update();

        //ADD INSTRUCTOR
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add();
    }
}
