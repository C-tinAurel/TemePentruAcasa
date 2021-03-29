public class Exercitiul6 {

    public static void main(String[] args) {

        //6.Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
        int n = 6;
        operatii(n);
    }

    //6.Numar inmultirea si impartirea unui numar intreg pana cand acesta ajunge la 1
    public static void operatii(int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println("Valoare lui n este " + n);
            } else {
                n = n * 3 + 1;
                System.out.println("Valoarea lui n impar este " + n);
            }
        }
    }
}
