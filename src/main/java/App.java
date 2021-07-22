import dao.InstructorDao;
import entity.one.to.one.Instructor;
import entity.one.to.one.InstructorDetail;


public class App {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Dart", "Vader", "start@deatch.com");

        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Laser swordr");
        // associate the objects
        instructorDetail.setInstructor(instructor);
        // associate the objects
        instructor.setInstructorDetail(instructorDetail);

        // when you get instructorDetail then hibernate also saves instructor info
        InstructorDao instructorDao = new InstructorDao();
        instructorDao.saveInstructor(instructor);

    }
}
