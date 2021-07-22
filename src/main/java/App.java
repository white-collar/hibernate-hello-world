import dao.InstructorDao;
import entity.one.to.one.Instructor;
import entity.one.to.one.InstructorDetail;


public class App {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Jon", "BonJovi", "jon@guitar.com");

        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Guitar");

        // associate the objects
        instructor.setInstructorDetail(instructorDetail);

        InstructorDao instructorDao = new InstructorDao();
        instructorDao.saveInstructor(instructor);

    }
}
