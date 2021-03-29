public class Exercitiul5 {

    public static void main(String[] args) {
        //5.Write a Java program to print characters between two characters (i.e. A to P ) from a text
        String text5 = "Stau câteodată şi-mi aduc aminte ce vremi şi ce oameni mai erau în părţile noastre pe când începusem şi eu, drăgăliţă-Doamne, a mă ridica băieţaş";
        caractereDintreAsiP(text5);
    }

    //5.Caracterele dintre A si P (l-am rezolvat datorita lui Catalin)
    public static void caractereDintreAsiP(String text5) {
        int primaLiteraA = text5.indexOf('a')+1;
        int ultimaLiteraP = text5.indexOf('p');
        //for (char cursor = primaLiteraA; cursor <= ultimaLiteraP; cursor++) {
        System.out.println("Caracaterele de la a la p sunt " + text5.substring(primaLiteraA, ultimaLiteraP));


    }
}
