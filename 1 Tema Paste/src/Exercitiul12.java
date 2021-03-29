public class Exercitiul12 {

    public static void main(String[] args) {
        //12.Write a Java program to compute the sum of first n given prime numbers.
        int numerePrime=2;
        sumaNumerelorPrime(numerePrime);
    }


    public static void sumaNumerelorPrime(int n) {
        int sum = 0;
        boolean numarPrim = true;
        int primulNumar = 0;
        int numar = 2;

        while (numar >= 2 && primulNumar <= n) {
            for (int cursor = 2; cursor < numar; cursor++) {
                if (numar % cursor == 0) {
                    numarPrim = false;
                    break;
                } else
                    numarPrim= true;
                primulNumar++;
            }
            if (numarPrim == true) {
                sum += numar;
            }
            numar++;
        }
        System.out.println(sum);
    }
}
