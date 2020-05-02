public class ErbivorAnimal extends TerestrialAnimal {
    //Modificatorul este private
    private boolean eatPlants;

    public ErbivorAnimal(String color, int memberNumber, String specimen, String move, boolean hunt, boolean eatPlants) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.move = move;
        this.eatPlants = eatPlants;
        this.specimen = specimen;
        this.hunt=hunt;
    }

    public boolean getEatPlants() {
        return eatPlants;
    }

    public String bites() {
        return "This animal doesn t bites";
    }
}
