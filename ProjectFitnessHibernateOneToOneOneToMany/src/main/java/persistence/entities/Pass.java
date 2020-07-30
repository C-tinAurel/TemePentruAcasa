package persistence.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "passes")
public class Pass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nume")
    private String name;
    @Column(name = "price")
    private int price;
    @Column(name = "begin_date")
    private int beginDate;
    @Column(name = "end_date")
    private int endDate;
    @OneToMany(mappedBy = "pass", cascade = CascadeType.ALL)
    private Set<Person> personSet;

    public Pass() {

    }

    public Pass(String name, int price, int beginDate, int endDate) {
        this.name = name;
        this.price = price;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Pass(String name, int price, int beginDate, int endDate, Set<Person> personSet) {
        this.name = name;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.personSet = personSet;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getBeginDate(){
        return beginDate;
    }
    public void setBeginDate(int beginDate){
        this.beginDate=beginDate;
    }
    public int getEndDate(){
        return endDate;
    }
    public void setEndDate(int endDate){
        this.endDate=endDate;
    }
    public Set<Person> getPersonSet(){
        return personSet;
    }
    public void setPersonSet(Set<Person> personSet){
        this.personSet=personSet;
    }

    @Override
    public String toString() {
        return "Pass{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", personSet=" + personSet +
                '}';
    }
}

