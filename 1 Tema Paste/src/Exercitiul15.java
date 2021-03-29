public class Exercitiul15 {

    public static void main(String[] args) {

        //15.Write a Java program to read a string and if the first or last characters are ’s’ or ’e’, return the string
        // without the words from odd positions.
        String text = "Suntem elevii clasei a 2-a e si suntem cuminti";

        cuvinteCuInceputulSiSfarsitulEsiS(text);
    }

    //15.Cuvinte care incep si se termina cu s si e !
    public static void cuvinteCuInceputulSiSfarsitulEsiS(String text) {
        String[] textImpartit = text.toLowerCase().split(" ");
        String texte = " ";
        for (int cursor = 0; cursor < text.length(); cursor++) {
            if (text.charAt(0)=='s' || textImpartit[cursor].startsWith("e") || textImpartit[cursor].endsWith("s") || textImpartit[cursor].endsWith("e")) {
                if (cursor % 2 == 0) {
                    texte += textImpartit[cursor] + " ";

                    System.out.println(texte);

                }
            }

        }
    }

}



