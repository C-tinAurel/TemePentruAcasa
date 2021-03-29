public class Exercitiul3 {

    public static void main(String[] args) {

        // 3.Write a Java program to display the middle character of a string.
        String text3 = "Patruzeci";
        caracterDinMijloc(text3);

    }

    //3.Gasirea caracterului din mijlocul unui string
    public static void caracterDinMijloc(String text3) {
        if (text3.length() % 2 == 0) {
            System.out.println("Se afiseaza 2 caractere din mijloc " + text3.charAt(text3.length() / 2 - 1) + text3.charAt(text3.length() / 2));
        } else {
            System.out.println("Se afiseaza 1 caracter din mijloc " + text3.charAt(text3.length() / 2));
        }

    }


}