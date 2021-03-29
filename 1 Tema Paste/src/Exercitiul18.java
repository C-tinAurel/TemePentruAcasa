public class Exercitiul18 {

    public static void main(String[] args) {
        //18.Write a Java program to replace all spaces from a string with “;” if the space is on an even position and with “|” if the space is on an odd position from a given string.
        String text18 = "Şi ne pomenim într-una din zile că părintele vine la şcoală şi ne aduce un scaun nou şi lung, şi după ce-a întrebat";
        inlocuireSpatii(text18);
    }
    //18.Inlocuirea spatiilor dintr un String cu ;
    public static void inlocuireSpatii(String text18) {
        String inlocuireSpatii = text18.replace(" ", ";");
        System.out.println("Rezultatul inlocuiri " + inlocuireSpatii);
    }

}
