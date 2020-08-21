package persistence.dao;

import org.hibernate.Session;
import persistence.entities.Person;


import javax.persistence.Query;
import java.util.List;

public class PersonDAO {

    public void insert(Person person){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
    }

    public List<Person> findPersonByName(String name){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query queryFindPersonByName=session.createNamedQuery("SelectPersonByName");
        queryFindPersonByName.setParameter("name",name);
        List<Person> personList=queryFindPersonByName.getResultList();
        session.getTransaction().commit();
        session.close();
        return personList;
    }

    public void deletePersonByYearOfBirth(int yearOfBirth){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query queryDeletePersonByYearOfBirth=session.createNamedQuery("DeletePersonByYearOfBirth");
        queryDeletePersonByYearOfBirth.setParameter("yearOfBirth",yearOfBirth);
        queryDeletePersonByYearOfBirth.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
