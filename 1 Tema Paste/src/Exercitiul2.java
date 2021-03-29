public class Exercitiul2 {

    public static void main(String[] args) {

        //2.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        int medieNumere = medieNumere(20, 30, 10);
        int x = 20;
        int y = 30;
        int z = 10;
        System.out.println("Media numerelor este " + medieNumere);
    }

    //2.Media a 3 numere
    public static int medieNumere(int x, int y, int z) {
        int suma = x + y + z;
        int medieNumere = suma / 3;
        return medieNumere;

    }
}
