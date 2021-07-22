import dao.StudentDao;
import entity.Student;

import java.util.List;


public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Diana", "Prince", "wonder@women.com");
        Student student1 = new Student("Stirlitz", "Max", "striliz@sd6.com");

        studentDao.saveStudent(student);
        studentDao.saveStudent(student1);

        studentDao.getStudentById(1);
        studentDao.loadStudentById(2);

    }
}
