package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class LecUtils {
    public void saveLecture(final Lecture lecture) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(lecture);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Lecture getLecture(final int id) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            final Lecture lecture = session.find(Lecture.class, Integer.valueOf(id));
            return lecture;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public void deleteLecture(final int id) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Lecture lecture = session.get(Lecture.class, Integer.valueOf(id));
                if (lecture != null) {
                    session.delete(lecture);
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

    public List<Lecture> getAllLectures() {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<Lecture> query = session.createQuery("FROM Lecture", Lecture.class);
            List<Lecture> lectures = query.getResultList();
            return lectures;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
