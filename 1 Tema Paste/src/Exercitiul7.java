public class Exercitiul7 {

    public static void main(String[] args) {

        //7.Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20
        int[] sirArray = {10,10, 7, 8, 12, 20, 20,8};
        elementeDelanga(sirArray);
    }

    //7.Sa aratam daca sunt elemente 10 langa 10 sau 20 langa 20 intr un tablou Array
    public static void elementeDelanga(int[] siraArray) {
        for (int cursor = 0; cursor < siraArray.length; cursor++) {
            if (siraArray[cursor] == 10) {
                System.out.println("Valorile lui 10 sunt pe pozitiile " + cursor );
            } else if (siraArray[cursor] == 20 ) {
                System.out.println("Valorile lui 20 sunt pe pozitiile " + cursor );
            }

        }
    }
}
