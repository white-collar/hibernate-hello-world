import dao.InstructorDao;
import entity.one.to.many.Course;
import entity.one.to.one.Instructor;
import entity.one.to.one.InstructorDetail;


public class App {
    public static void main(String[] args) {
        InstructorDao instructorDao = new InstructorDao();

        Instructor instructor = new Instructor("Sherlock", "Holmes", "sherlock@holmes");

        // create some courses
        Course tempCourse1 = new Course("Learn Spring Boot");
        instructor.getCourses().add(tempCourse1);

        Course tempCourse2 = new Course("Learn hibernate");
        instructor.getCourses().add(tempCourse2);

        instructorDao.saveInstructor(instructor);

    }
}
