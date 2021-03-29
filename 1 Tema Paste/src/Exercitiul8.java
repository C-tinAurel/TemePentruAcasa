public class Exercitiul8 {

    public static void main(String[] args) {

        //8.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        int[] numere = {2, 4, 6, 8};
        numereMaiMariCaMedia(numere);
    }
    //8.Afisare numerelor mai mari ca media
    public static void numereMaiMariCaMedia(int[] arrayInteger) {
        int sumaNumere = 0;
        int medie = 0;
        for (int cursor = 0; cursor < arrayInteger.length; cursor++) {
            sumaNumere += arrayInteger[cursor];
        }
        medie = sumaNumere / arrayInteger.length;
        System.out.println("Media numerelor este " +medie);
        for (int cursor=0;cursor< arrayInteger.length;cursor++){
            if(arrayInteger[cursor]>medie){
                System.out.println(arrayInteger[cursor]);
            }
        }
    }
}
