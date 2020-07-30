import persistence.dao.PassDao;
import persistence.dao.PersonDao;
import persistence.dao.WorkoutDao;
import persistence.entities.Gym;
import persistence.entities.Pass;
import persistence.entities.Person;
import persistence.entities.Workout;


public class Main {
    public static void main(String[] args) {
        System.out.println("Aici vom introduce 5 persoane,3 abonamente si 10 antrenamente");
        //Adaugam 5 persoane:
        PersonDao personDao = new PersonDao();
        PassDao passDao = new PassDao();
        WorkoutDao workoutDao = new WorkoutDao();
        //Adaugam persoane
        Pass pass = new Pass("Sport for life", 100, 01 / 07 / 2020, 30 / 07 / 2020);
        Workout workout = new Workout("Cross Fit", 25, false);
        Gym gym = new Gym("Bodycuts", workout);
        Person person = new Person("Florin", "Mihai", 1985, pass, workout);
        personDao.insert(person);

        Pass pass1 = new Pass("No Pain No Gain", 100, 25 / 02 / 2019, 24 / 03 / 2019);
        Workout workout1 = new Workout("Jumbo", 60, true);
        Gym gym1 = new Gym("Build body", workout1);
        Person person1 = new Person("Ilie", "Ciprian", 24, pass1, workout1);
        personDao.insert(person1);

        Pass pass2 = new Pass("Fitness life", 120, 13 / 06 / 2019, 12 / 07 / 2019);
        Workout workout2 = new Workout("Zomba", 70, true);
        Gym gym2 = new Gym("It's your time", workout2);
        Person person2 = new Person("Constantin", "Radu", 2002, pass2, workout2);
        personDao.insert(person2);

        Pass pass3 = new Pass("Sport for life", 150, 03 / 06 / 2020, 02 / 07 / 2020);
        Workout workout3 = new Workout("Dance Cardio", 60, true);
        Gym gym3 = new Gym("Unstoppable", workout3);
        Person person3 = new Person("Eminescu", "Cosbuc", 1987, pass3, workout3);
        personDao.insert(person3);

        Pass pass4 = new Pass("Culturism Fitness", 140, 03 / 03 / 2020, 02 / 04 / 2020);
        Workout workout4 = new Workout("Fitness dance", 30, false);
        Gym gym4 = new Gym("Fight for your body", workout4);
        Person person4 = new Person("Rata", "Bogdan", 1980, pass4, workout4);
        personDao.insert(person4);

        //Adaugam 3 abonamente
        passDao.insert(pass);
        passDao.insert(pass1);
        passDao.insert(pass2);

        //Adaugam 10 antrenamente
        workoutDao.insert(workout);
        workoutDao.insert(workout1);
        workoutDao.insert(workout2);
        workoutDao.insert(workout3);
        workoutDao.insert(workout4);
        Workout workout5=new Workout("Run for life",70,true);
        Workout workout6=new Workout("Boxing",20,true);
        Workout workout7=new Workout("Cardio",30,false);
        Workout workout8=new Workout("Aerobic",60,true);
        Workout workout9=new Workout("Swimming",45,false);
        workoutDao.insert(workout5);
        workoutDao.insert(workout6);
        workoutDao.insert(workout7);
        workoutDao.insert(workout8);
        workoutDao.insert(workout9);
    }
}
