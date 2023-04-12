package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionCreator {
    private static final SessionFactory sessionFactory = configureSessionFactory();

    private static SessionFactory configureSessionFactory() throws HibernateException {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        return configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
