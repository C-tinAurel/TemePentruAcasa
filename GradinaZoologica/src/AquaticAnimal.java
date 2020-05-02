public class AquaticAnimal extends Animal {
    //modificatorul de acces
    protected int deep;
    protected int specimenNumber;

    public AquaticAnimal(String color, int memberNumber, int deep, String specimen, int specimenNumber) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.deep = deep;
        this.specimen = specimen;
        this.specimenNumber = specimenNumber;

    }
   //constructor
    public AquaticAnimal() {

    }

    public int getDeep() {
        return deep;
    }

    public int getspecimenNumber() {
        return specimenNumber;
    }
    public String waterAnimal(){
        return "Animale de apa";
    }
}

