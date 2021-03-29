public class Exercitiul16 {

    public static void main(String[] args) {
        //16.Write a Java program to count the number of words ending that have more than 2 vowels
        String text = "Albastru este o culoare rece si atat ";
        numerotareCuvinteCu2Vocale(text);

    }

    public static void numerotareCuvinteCu2Vocale(String text) {
        int cuvinteCuVocale = 0;
        String[] impartireText = text.toLowerCase().split(" ");
        for (String cuvant : impartireText) {
         int  cuvinteVocale = 0;
            for (int cursor = 0; cursor < cuvant.length(); cursor++) {
                if (cuvant.charAt(cursor) == 'a' || cuvant.charAt(cursor) == 'e' || cuvant.charAt(cursor) == 'i' || cuvant.charAt(cursor) == 'o' || cuvant.charAt(cursor) == 'u') {
                    cuvinteVocale++;

                }
            }
            if (cuvinteVocale > 2) {
                cuvinteCuVocale++;

            }
        }
        System.out.println("Numerele cuvintelor cu mai mult de 2 vocale sunt " +cuvinteCuVocale);
    }
}
