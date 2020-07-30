package persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "gyms")
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workouts_id")
    private Workout workout;

    public Gym() {

    }

    public Gym(String name,Workout workout) {
        this.workout = workout;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "name='" + name + '\'' +
                ", workout=" + workout +
                '}';
    }
}
