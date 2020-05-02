public class Mamel extends TerestrialAnimal {
    //Incepem cu modificatorul private
    private int maximumBreeding;

    public Mamel(String color,int memberNumber,String specimen, String move,boolean hunt,int maximumBreeding){
        this.color=color;
        this.memberNumber=memberNumber;
        this.move=move;
        this.hunt=hunt;
        this.maximumBreeding=maximumBreeding;
        this.specimen=specimen;
    }
    public int getMaximumBreeding(){
        return maximumBreeding;
    }
    public String bites(){
        return "This animal bites on land if attack it s child";
    }
}
