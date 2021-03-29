public class Exercitiul14 {

    public static void main(String[] args) {
        //14.Write a Java program to print the characters on positions that are multiple of 5 BUT NOT multiple of 10

        String text = "Ana Maria are mere si pere";
           afisamCaractereDePePozitia5(text);

    }

    public static void afisamCaractereDePePozitia5(String text) {
        for (int cursor = 0; cursor < text.length(); cursor++) {
            if (cursor % 5 == 0 && cursor % 10 != 0) {
                    System.out.println(text.charAt(cursor) + " ");
            }
        }
    }
}
