package hibernate.DBUtils;

import hibernate.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class StUtils {
    public static Student getStudent(final int id) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            final Student student = session.find(Student.class, Integer.valueOf(id));
            return student;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static void deleteStudent(final int id) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Student student = session.get(Student.class, Integer.valueOf(id));
                if (student != null) {
                    session.delete(student);
                }
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                throw new IllegalStateException(e);
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static List<Student> getAllStudents() {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<Student> query = session.createQuery("FROM Student ", Student.class);
            List<Student> students = query.getResultList();
            return students;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
