public class Exercitiul1 {

    public static void main(String[] args) {
        // 1.Write a Java program to find the smallest number among three numbers.
        int a = 12;
        int b = 23;
        int c = 17;
        gasireaNumaruluiCelMaiMic(a, b, c);
    }

    //1.Gasirea numarului cel mai mic
    public static void gasireaNumaruluiCelMaiMic(int a, int b, int c) {
        System.out.println("Gasirea numarului cel mai mic");
        if (a < b && a < c) {
            System.out.println(a + " este cel mai mic numar");
        } else if (b < a && b < c) {
            System.out.println(b + " este cel mai mic numar");
        } else {
            System.out.println(c + " este cel mai mic numar");
        }
    }
}
