package persistence.dao;

import org.hibernate.Session;
import persistence.entities.Book;

import javax.persistence.Query;
import java.util.List;

public class BookDAO {

    public void insert(Book book){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();
    }

    public List<Book> findBookByTitle(String title){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query queryFindBookByTitle=session.createNamedQuery("FindBookByTitle");
        queryFindBookByTitle.setParameter("title",title);
        List<Book> bookList=queryFindBookByTitle.getResultList();
        session.getTransaction().commit();
        session.close();
        return bookList;

    }
    public void deleteBookByVolumNumber(int volumNumber){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query queryDeleteBookByVolumNumber=session.createNamedQuery("DeleteBookByVolumNumber");
        queryDeleteBookByVolumNumber.setParameter("volumNumber",volumNumber);
        queryDeleteBookByVolumNumber.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
