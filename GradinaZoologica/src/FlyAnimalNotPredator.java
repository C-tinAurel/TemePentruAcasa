public class FlyAnimalNotPredator extends AirAnimal {
    //modificatorul este
    private boolean notpredator;

    //atribuim
    public FlyAnimalNotPredator(String color, int memberNumber, int flyIngHeight, String specimen, boolean notpredator) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.flyIngHeight = flyIngHeight;
        this.specimen = specimen;
        this.notpredator = notpredator;

    }

    public boolean getNotPredator() {
        return notpredator;
    }
}
