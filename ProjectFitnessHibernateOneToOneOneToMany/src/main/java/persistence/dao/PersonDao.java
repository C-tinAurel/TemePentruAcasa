package persistence.dao;

import org.hibernate.Session;

import persistence.entities.Person;

public class PersonDao {

    public void insert(Person person){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
    }
}
