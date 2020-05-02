public class AirAnimal extends Animal {
    protected int flyIngHeight;

    public AirAnimal(String color, int memberNumber, int flyIngHeight, String specimen) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.flyIngHeight = flyIngHeight;
        this.specimen = specimen;
    }

    public AirAnimal() {

    }

    public int getFlyIngHeight() {
        return flyIngHeight;
    }
}
