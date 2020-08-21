import persistence.dao.AuthorDAO;
import persistence.dao.BookDAO;
import persistence.dao.PersonDAO;
import persistence.dao.SectionDAO;
import persistence.entities.Author;
import persistence.entities.Book;
import persistence.entities.Person;
import persistence.entities.Section;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Biblioteca");

        AuthorDAO authorDAO = new AuthorDAO();
        PersonDAO personDAO = new PersonDAO();
        BookDAO bookDAO = new BookDAO();
        SectionDAO sectionDAO = new SectionDAO();

        System.out.println("1.Am adaugat persoane");
        //Am adaugata persoane
        Author author = new Author("Ion", "Creanga");
        Section section = new Section("Literatura");
        Book book = new Book("Amintiri din copilarie", 4, "memorialistic", false, true, author, section);
        Person person = new Person("Cristea", "Lica", "Galati", 1992);
        // personDAO.insert(person);

        Author authors = new Author("Ion", "Creanga");
        Section section2 = new Section("Comedie");
        Book book1 = new Book("Danila Prepeleac", 3, "epic", true, true, authors, section2);
        Person person1 = new Person("Ionut", "Catalin", "Timisoara", 2002);
        // personDAO.insert(person1);

        Author author1 = new Author("Mircea", "Eliade");
        Section section1 = new Section("Aventura");
        Book book2 = new Book("Noaptea de Sanziene", 2, "epic", false, true, author1, section1);
        Person person2 = new Person("Gheorghe", "George", "Bucuresti", 2000);
        // personDAO.insert(person2);


        System.out.println("2.Am adaugat autori");
        //Inseram autori
        // authorDAO.insert(author);
        // authorDAO.insert(author1);
        System.out.println("3.Adaugam carti");
        //Inseram carti
        //  bookDAO.insert(book);
        //bookDAO.insert(book1);
        //bookDAO.insert(book2);

        System.out.println("4.Adaugam sectiuni");
        //inseram sectiuni
        //  sectionDAO.insert(section);
        //sectionDAO.insert(section1);
        // sectionDAO.insert(section2);

        //1.Am creat relatia dintre Autor si Persoana 2M2
        Set<Person> personSet = new HashSet<>();

      /* personSet.add(person);
       personSet.add(person1);

       author.setPersonSet(personSet);
       author.setPersonSet(personSet);

       authorDAO.insert(author);
       authorDAO.insert(author1);*/

        //2.AM ADAUGAT AUTORI SI SECTIUNI 2M2
        Set<Author> authorSet = new HashSet<>();
       /*authorSet.add(author);
       authorSet.add(author1);

       section.setAuthorSet(authorSet);
       section2.setAuthorSet(authorSet);

       sectionDAO.insert(section);
       sectionDAO.insert(section1);*/


        //3.AM ADUGAT PERSOANE IN SECTIUNI 2M2
     /* Set<Section> sectionsSet=new HashSet<>();
       sectionsSet.add(section);
       sectionsSet.add(section1);
       sectionsSet.add(section2);

       person.setSectionSet(sectionsSet);
       person1.setSectionSet(sectionsSet);
       person2.setSectionSet(sectionsSet);

       personDAO.insert(person);
       personDAO.insert(person1);
       personDAO.insert(person2);*/

        //4.ADAUGAM PERSOANE LA CARTI 2M2
        Set<Book> bookSet = new HashSet<>();

       /* bookSet.add(book);
        bookSet.add(book1);
        bookSet.add(book2);

        person.setBookSet(bookSet);
        person1.setBookSet(bookSet);
        person2.setBookSet(bookSet);

        personDAO.insert(person);
        personDAO.insert(person1);
        personDAO.insert(person2);*/

        //5.Adaugam Carti intr-o Sctiune 2M1
        bookSet.add(book1);
        bookSet.add(book2);
        Section sectionBook = new Section("Comedie", bookSet);
        sectionDAO.insert(sectionBook);


    }
}
