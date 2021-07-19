import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;


public class App {
    public static void main(String[] args) {
        Student student = new Student("James", "Bond", "007@mi.com");
        Student student1 = new Student("Bruce", "Wayne", "batman@gotham.com");
        Student student2 = new Student("Ethan", "Hunt", "mission@impossible.com");


        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(student);
            session.save(student1);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }


        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Student> students = session.createQuery("from Student", Student.class).list();
            students.forEach(s -> {
                System.out.println("Print student email id : " + s.getEmail());
            });
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

    }
}
