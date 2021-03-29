public class Exercitiul4 {

    public static void main(String[] args) {

        // 4.Write a Java program to count all words in a string.
        String text4 = "Puteți traduce text, scriere de mână, fotografii și vorbire în peste o sută de limbi, cu aplicația Google Traducere. Alternativ, puteți folosi Traducere pe web";
        int numarareCuvinte = numarareCuvinte(text4);
        System.out.println("Numerotarea cuvintelor este " + numarareCuvinte);
    }

    //4:Numararea cuvintelor
    public static int numarareCuvinte(String text4) {
        int numarCuvant = 1;
        String[] lungimeString = new String[text4.length()];
        for (int cursor = 0; cursor <= lungimeString.length - 1; cursor++) {
            char numereCuvinte = text4.charAt(cursor);
            {
                if (numereCuvinte == ' ' || numereCuvinte == ',' || numereCuvinte == '.') {
                    numarCuvant++;
                }
            }
        }
        return numarCuvant;
    }
}
