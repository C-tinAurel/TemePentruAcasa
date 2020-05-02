import javax.swing.*;

public class Main {
    public static void main(String[] agrs) {
        // 1.Write a Java program to find the smallest number among three numbers.
        int a = 12;
        int b = 23;
        int c = 17;
        gasireaNumaruluiCelMaiMic(a, b, c);

        //2.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        int medieNumere = medieNumere(20, 30, 10);
        int x = 20;
        int y = 30;
        int z = 10;
        System.out.println("Media numerelor este " + medieNumere);

        // 3.Write a Java program to display the middle character of a string.
        String text3 = "Patruzeci";
        caracterDinMijloc(text3);

        // 4.Write a Java program to count all words in a string.
        String text4 = "Puteți traduce text, scriere de mână, fotografii și vorbire în peste o sută de limbi, cu aplicația Google Traducere. Alternativ, puteți folosi Traducere pe web";
        int numarareCuvinte = numarareCuvinte(text4);
        System.out.println("Numerotarea cuvintelor este " + numarareCuvinte);

        //5.Write a Java program to print characters between two characters (i.e. A to P ) from a text
        String text5 = "Stau câteodată şi-mi aduc aminte ce vremi şi ce oameni mai erau în părţile noastre pe când începusem şi eu, drăgăliţă-Doamne, a mă ridica băieţaş";
        caractereDintreAsiP(text5);

        //6.Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
        int n = 5;
        operatii(n);

        //7.Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20
        int[] sirArray = {10, 10, 7, 8, 12, 20, 20, 17};
        elementeDelanga(sirArray);
        //8.Write a Java program to find the numbers greater than the average of the numbers of a given array.


        //9.Write a Java program to check if the value 20 appears three times in an array

        //10.Write a Java program to add all the digits of a given positive integer until the result has a single digit.

        //11.Write a Java program to check if a positive number is a palindrome or not.
        String text11 = "Humuleştii, şi pe vremea aceea, nu erau numai aşa, un sat de oameni fără căpătâi, ci sat vechi răzăşesc, întemeiat în toată puterea cuvântului: cu gospodari tot unul";
        boolean palindrome = NumarpozitivSauNuPentruPalindrom(text11);
        System.out.println("Palindromul este " + palindrome);

        //12.Write a Java program to compute the sum of first n given prime numbers.

        //13.Write a Java program to find the find the word from the middle of a given string.
        String text13 = "un băiat prizărit, ruşinos şi fricos şi de umbra mea. Şi cea dintâi şcolăriţă a fost însăşi Smărăndiţa popii, o zgâtie de copilă ageră la minte şi aşa de silitoare, de întrecea mai pe toţi băieţii şi din carte, dar şi din nebunii";

        //14.Write a Java program to print the characters on positions that are multiple of 5 BUT NOT multiple of 10

        //15.Write a Java program to read a string and if the first or last characters are ’s’ or ’e’, return the string without the words from odd positions.
        String text15 = "Şi ne pomenim într-una din zile că părintele vine la şcoală şi ne aduce un scaun nou şi lung, şi după ce-a întrebat de dascăl";
        cuvinteCuInceputulSiSfarsitulEsiS(text15);
        //16.Write a Java program to count the number of words ending that have more than 2 vowels

        //17.Write a Java program to count all “,” and spaces in a text
        String text17 = "Şi ne pomenim într-una din zile că părintele vine la şcoală şi ne aduce un scaun nou şi lung, şi după ce-a întrebat de dascăl, care cum ne purtăm, a stat puţin pe gânduri, apoi a pus nume scaunului Calul Balan şi l-a lăsat în şcoală. În altă";
        int sumaVirgulaSiSpatii = numarareVirgulaSiSpatii(text17);
        System.out.println("Suma virgulelor si a spatilor este " + sumaVirgulaSiSpatii);

        //18.Write a Java program to replace all spaces from a string with “;” if the space is on an even position and with “|” if the space is on an odd position from a given string.
        String text18 = "Şi ne pomenim într-una din zile că părintele vine la şcoală şi ne aduce un scaun nou şi lung, şi după ce-a întrebat";
        inlocuireSpatii(text18);
    }

    //1.Gasirea numarului cel mai mic
    public static void gasireaNumaruluiCelMaiMic(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a + " este cel mai mic numar");
        } else if (b < a && b < c) {
            System.out.println(b + " este cel mai mic numar");
        } else {
            System.out.println(c + " este cel mai mic numar");
        }
    }

    //2.Media a 3 numere
    public static int medieNumere(int x, int y, int z) {
        int suma = x + y + z;
        int medieNumere = suma / 3;
        return medieNumere;

    }

    //3.Gasirea caracterului din mijlocul unui string
    public static void caracterDinMijloc(String text3) {
        if (text3.length() - 1 % 2 == 0) {
            System.out.println("Se afiseaza 2 caractere din mijloc " + text3.length());
        } else {
            System.out.println("Se afiseaza 1 caracter din mijloc " + text3.length());
        }
        char caracterMijloc = text3.charAt(text3.length() / 2);
        System.out.println("Caracterul din mijloc este  " + caracterMijloc);
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


    //5.Caracterele dintre A si P (l-am rezolvat datorita lui Catalin)

    public static void caractereDintreAsiP(String text5) {
        int primaLiteraA = text5.indexOf('a') + 1;
        int ultimaLiteraP = text5.indexOf('p');
        //for (char cursor = primaLiteraA; cursor <= ultimaLiteraP; cursor++) {
        System.out.println("Caracaterele de la a la p sunt " + text5.substring(primaLiteraA, ultimaLiteraP));
        // }

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

    //7.Sa aratam daca sunt elemente 10 langa 10 sau 20 langa 20 intr un tablou Array

    public static void elementeDelanga(int[] siraArray) {
        for (int cursor = 0; cursor < siraArray.length - 1; cursor++) {
            int cursor2 = cursor + 1;
            if (siraArray[cursor] == 10 && siraArray[cursor2] == 10) {
                System.out.println("Valorile lui 10 sunt pe pozitiile " + cursor + " " + cursor2);
            } else if (siraArray[cursor] == 20 && siraArray[cursor2] == 20) {
                System.out.println("Valorile lui 20 sunt pe pozitiile " + cursor + " " + cursor2);
            }

        }
    }


    //11.Palindromul
    public static boolean NumarpozitivSauNuPentruPalindrom(String text11) {
        int lungimeString = text11.length();
        int lungimeString2 = text11.length();
        while (lungimeString < lungimeString) {
            if (lungimeString++ != lungimeString2--) ;
            return false;
        }
        return true;
    }

    //15.Cuvinte care incep si se termina cu s si e NU AM REUSIT!!!!
    public static void cuvinteCuInceputulSiSfarsitulEsiS(String text15){
        char a =' ';
        if(text15.startsWith("e") || text15.startsWith("s") || text15.endsWith("e") || text15.endsWith("s")){
            for(int cursor = 1;cursor<=text15.length()-1;cursor+=2){
                a = text15.charAt(cursor);
                System.out.println(a);
            }
        }
        System.out.println("Cuvintele sunt " +a);
    }


    //17.Numararea "," si a spatiilor
    public static int numarareVirgulaSiSpatii(String text17) {
        int sumaVirgulaSiSpatii = 0;
        for (int cursor = 0; cursor < text17.length() - 1; cursor++) {
            char caractereCautate = text17.charAt(cursor);
            if (caractereCautate == ' ') {
                sumaVirgulaSiSpatii++;
            } else if (caractereCautate == ',') {
                sumaVirgulaSiSpatii++;
            }
        }
        return sumaVirgulaSiSpatii;
    }

    //18.Inlocuirea spatiilor dintr un String cu ;
    public static void inlocuireSpatii(String text18) {
        String inlocuireSpatii = text18.replace(" ", ";");
        System.out.println("Rezultatul inlocuiri " + inlocuireSpatii);
    }
}
