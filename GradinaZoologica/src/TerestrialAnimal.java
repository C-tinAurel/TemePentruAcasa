public class TerestrialAnimal extends Animal {
    //modificatorul este acees private
    protected String move;
    protected boolean hunt;

    public TerestrialAnimal(String color, int memberNumber,String specimen, String move, boolean hunt) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.move = move;
        this.hunt = hunt;
        this.specimen=specimen;
    }

    public TerestrialAnimal(){

    }

    public String getMove() {
        return move;
    }
    public boolean getHunt(){
        return hunt;
    }
    public String bites(){
       return "This animal bites on land";
    }
}
