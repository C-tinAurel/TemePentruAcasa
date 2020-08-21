package persistence.dao;

import org.hibernate.Session;
import persistence.entities.Author;

import javax.persistence.Query;
import java.util.List;

public class AuthorDAO {

    public void insert(Author author) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
    }

    public List<Author> findAuthorByName(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query queryFindAuthorByName =session.createNamedQuery("findAuthorByName");
        queryFindAuthorByName.setParameter("name",name);
        List<Author> authorList=queryFindAuthorByName.getResultList();
        session.getTransaction().commit();
        session.close();
        return authorList;

    }
    public void deleteAuthorByName(String name){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query queryDeleteAuthorByName=session.createNamedQuery("DeleteAuthorByName");
        queryDeleteAuthorByName.setParameter("name",name);
        queryDeleteAuthorByName.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

}
