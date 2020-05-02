public class Animal {
    protected String color;
    protected int memberNumber;
    protected String specimen;

    //acum atribuim
    public Animal(String color, int memberNumber, String specimen) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.specimen = specimen;
        //Initializat
    }

    public Animal() {

    }

    public String getColor() {
        return color;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public String bites() {
        return "This animal bites :";
    }

    public String getSpecimen() {
        return specimen;
    }


}
