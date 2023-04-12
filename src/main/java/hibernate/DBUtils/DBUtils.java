package hibernate.DBUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DBUtils {
    public static <T> void saveEntity(final T entity) {
        final SessionFactory sessionFactory = SessionCreator.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
