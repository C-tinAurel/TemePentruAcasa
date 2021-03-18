public class Main {
    public static void main(String[] args) {

        //Aici apelam constructori de tip Fruct si apelam metodele
        Fruct banana=new Banana();
        banana.getCuloare();
        banana.getGust();
        Fruct para= new Para();
        para.getCuloare();
        para.getGust();
        Fruct persica=new Persica();
        persica.getGust();
        persica.getCuloare();

    }
}
