public class Exercitiul11 {

    public static void main(String[] args) {
        //11.Write a Java program to check if a positive number is a palindrome or not.
        int numar = 1001;
        numarPalindrom(numar);
    }

    //11.Palindromul
    public static void numarPalindrom(int numar) {
        int numaratoareDesc = 0;
        int palindrom = numar;
        while (palindrom > 0) {
            numaratoareDesc = numaratoareDesc * 10 + palindrom % 10;

            palindrom = palindrom / 10;

        }
        if (numaratoareDesc == numar) {
            System.out.println(numar + " este palindrom");
        } else {
            System.out.println(numar + " nu este palindrom");
        }


    }
}
