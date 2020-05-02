public class FlyAnimalPredator extends AirAnimal {
    //modifactorul nostru este
    private boolean predator;

    //atribuim
    public FlyAnimalPredator(String color, int memberNumber, int FlyInghHeight, String specimen, boolean predator) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.flyIngHeight = FlyInghHeight;
        this.predator = predator;

    }

    public boolean getPredator() {
        return predator;
    }

}
