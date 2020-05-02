public class CarnivoreAnimal extends TerestrialAnimal {
    //modificatorul de acces este private
    private boolean eatMeat;

    public CarnivoreAnimal(String color, int memberNumber, String specimen, String move, boolean hunt, boolean eatMeat) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.move = move;
        this.hunt = hunt;
        this.eatMeat = eatMeat;
        this.specimen = specimen;
    }

    public boolean getEatMeat() {
        return eatMeat;
    }
}
