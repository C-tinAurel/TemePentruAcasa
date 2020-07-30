package persistence.entities;

import javax.persistence.*;

@Entity
@Table(name="personas")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="year_of_birth")
    private int yearOfBirth;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="passes_id")
    private Pass pass;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="workouts_id")
    private Workout workout;

    public Person(){

    }

    public Person(String name, String surname, int yearOfBirth, Pass pass,Workout workout) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.pass = pass;
        this.workout=workout;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Pass getPass() {
        return pass;
    }

    public void setPass(Pass pass) {
        this.pass = pass;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", pass=" + pass +
                ", workout=" + workout +
                '}';
    }
}
