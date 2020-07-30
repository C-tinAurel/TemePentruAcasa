package persistence.entities;

import javax.persistence.*;

@Entity
@Table(name="workouts")
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="duration")
    private int durantion;
    @Column(name="aerobic")
    private boolean aerobic;
    @OneToOne(mappedBy = "workout",cascade = CascadeType.ALL)
    private Person person;
    @OneToOne(mappedBy = "workout",cascade = CascadeType.ALL)
    private Gym gym;

    public Workout(){

    }
    public Workout(String name,int durantion,boolean aerobic){
        this.name=name;
        this.durantion=durantion;
        this.aerobic=aerobic;
    }

    public Workout(String name,int durantion, boolean aerobic, Person person,Gym gym) {
        this.durantion = durantion;
        this.aerobic = aerobic;
        this.person = person;
        this.gym=gym;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDurantion() {
        return durantion;
    }

    public void setDurantion(int durantion) {
        this.durantion = durantion;
    }

    public boolean isAerobic() {
        return aerobic;
    }

    public void setAerobic(boolean aerobic) {
        this.aerobic = aerobic;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", durantion=" + durantion +
                ", aerobic=" + aerobic +
                ", person=" + person +
                ", gym=" + gym +
                '}';
    }
}
