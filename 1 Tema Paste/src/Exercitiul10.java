public class Exercitiul10 {

    public static void main(String[] args) {
        //10.Write a Java program to add all the digits of a given positive integer until the result has a single digit.
        int numar = 254;
        unSingurNumar(numar);
    }

    //10.Scriem toate cifrele unui număr întreg pozitiv dat până când rezultatul are o singură cifră
    public static void unSingurNumar(int a) {
        int suma = 0;
        while (a > 0) {
            suma += a % 10;
            System.out.println("afisam suma " + suma);
            a = a / 10;
            System.out.println("afisam numarul " + a);
        }
        System.out.println(suma);
    }


}
