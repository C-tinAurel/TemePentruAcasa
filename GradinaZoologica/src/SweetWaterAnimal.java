public class SweetWaterAnimal extends AquaticAnimal {

    public SweetWaterAnimal() {

    }


    public SweetWaterAnimal(String color, int memberNumber, int deep, String specimen, int specimenNumber) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.deep = deep;
        this.specimen = specimen;
        this.specimenNumber = specimenNumber;
    }

    public String waterAnimal() {
        return "Animal de apa dulce";
    }


}

