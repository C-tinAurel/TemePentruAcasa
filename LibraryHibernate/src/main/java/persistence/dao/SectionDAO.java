package persistence.dao;

import org.hibernate.Session;
import persistence.entities.Person;
import persistence.entities.Section;

import javax.persistence.Query;
import java.util.List;

public class SectionDAO {

    public void insert(Section section) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(section);
        session.getTransaction().commit();
        session.close();
    }

    public List<Person> findPersonByName(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query queryFindSectionByName = session.createNamedQuery("SelectSectionByName");
        queryFindSectionByName.setParameter("name", name);
        List<Person> personList = queryFindSectionByName.getResultList();
        session.getTransaction().commit();
        session.close();
        return personList;
    }


    public void deleteSectionByName(String name){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query queryDeleteSectionByName=session.createNamedQuery("DeleteSectionByName");
        queryDeleteSectionByName.setParameter("name",name);
        queryDeleteSectionByName.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
