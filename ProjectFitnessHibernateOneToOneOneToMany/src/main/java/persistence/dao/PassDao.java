package persistence.dao;

import org.hibernate.Session;
import persistence.entities.Pass;

public class PassDao {

    public void insert(Pass pass){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(pass);
        session.getTransaction().commit();
        session.close();
    }
}
