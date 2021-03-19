import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Sa se reprezinte un calculator care face operatii simple (adunare, scadere,..), operatiile stiintifice dar si urmatoarele operatii cu stringuri:
        // --concateneaza 2 stringuri
        // -- verifica daca stringul contine un anumit caracter
        // -- aduna lungimea a 2 stringuri
        // -- verifica daca lungimea unui string este numar par sau impar
        // -- transforma un string intr-un sir de caractere
        // -- verifica daca stringul incepe cu o vocala
        // -- numara spatiile dintr-un string


        CalculatorOperatiiStiintifice calculator = new CalculatorOperatiiStiintifice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rugam introduceti doua numere");

        int primulNumar = scanner.nextInt();
        int alDoileaNumar = scanner.nextInt();
        System.out.println("Numerele introduse sunt " + primulNumar + " si " + alDoileaNumar);

        System.out.println("Optiuni operatii");
        System.out.println("1.Adunare");
        System.out.println("2.Scadere");
        System.out.println("3.Inmultire");
        System.out.println("4.Impartire");
        System.out.println("5.Ridicare la putere");
        System.out.println("6.Radical dintr-un numar");
        System.out.println("7.Logaritm dintr-un numar");
        System.out.println("8.Logaritm in baza 10");
        System.out.println("Pentru a iesi tastati 9");

        int optiune = 0;
        optiune = scanner.nextInt();
        while (optiune != 9) {
            if (optiune == 1) {
                System.out.println("Ati ales optiunea Adunare");
                System.out.println("Rezultatul adunari este " + calculator.adunare(primulNumar, alDoileaNumar));
            } else if (optiune == 2) {
                System.out.println("Ati ales optiunea Scadere");
                System.out.println("Rezultatul scaderi este " + calculator.scadere(primulNumar, alDoileaNumar));
            } else if (optiune == 3) {
                System.out.println("Ati ales optiunea Inmultire");
                System.out.println("Rezultatul inmultiri este " + calculator.inmultire(primulNumar, alDoileaNumar));
            } else if (optiune == 4) {
                System.out.println("Ati introdus optiunea Impartire");
                System.out.println("Rezultatul impartiri este " + calculator.impartire(primulNumar, alDoileaNumar));
            } else if (optiune == 5) {
                System.out.println("Ati introdus optiunea Ridicarea la putere");
                System.out.println("Rezultatul ridicari la putere este " + calculator.ridicareaLaPutere(primulNumar, alDoileaNumar));
            } else if (optiune == 6) {
                System.out.println("Ati introdus optiunea Radical dintr-un numar");
                System.out.println("Rezultatul radicalului este " + calculator.radicalDintrUnNumar(primulNumar));
            } else if (optiune == 7) {
                System.out.println("Ati introdus optiunea Logaritm dintr-un numar");
                System.out.println("Rezultatul este " + calculator.logaritmDintrUnNumar(primulNumar));
            } else if (optiune == 8) {
                System.out.println("Ati introdus optiunea Logaritm din baza 10");
                System.out.println("Rezultatul este " + calculator.radicalDintrUnNumar(primulNumar));
            } else {
                System.out.println("Nu exista aceasta optiune");
            }
            optiune = scanner.nextInt();
        }
        System.out.println("Pentru ca ati apasat tasta 9 am iesit din program.O zi buna!");


        //Calculam String-uri
        CalculatorString calculatorString = new CalculatorString();

        Scanner string = new Scanner(System.in);
        System.out.println("Va rugam introduceti textele");
        String text = string.nextLine();
        String text2 = string.nextLine();

        System.out.println("Ati introdus " + text + " si " + text2 );
        System.out.println("Meniu calculator string");
        System.out.println("1.Concatenare");
        System.out.println("2.VerificareCaracter");
        System.out.println("3.Suma lungimi String-urilor");
        System.out.println("4.Verificare string daca este par sau impar");
        System.out.println("5.Transformare string in caractere");
        System.out.println("6.Verificare string daca incepe cu o vocala");
        System.out.println("7.Numarare spatii string");
        System.out.println("Pentru a iesi tastati 9");

        int optiuneString = scanner.nextInt();
        while (optiuneString != 9) {
            if (optiuneString == 1) {
                System.out.println("Ati ales optiunea Concatenare");
                System.out.println("Concatenare textelor este " + calculatorString.concatenareStringuri(text, text2));

            } else if (optiuneString == 2) {
                System.out.println("Ati ales optiunea Verificare caracter");
                System.out.println("Rezultatul verificari este " + calculatorString.verificareDacaStringulContineUnCaracterAnume(text, 'a'));
            }else if(optiuneString==3){
                System.out.println("Ati ales optiunea Suma lungimi String-urilor");
                System.out.println("Rezultatul este " + calculatorString.sumaADouaStringuri(text,text2));
            }else if(optiuneString==4){
                System.out.println("Ati ales optiunea Verificare string par sau impar");
                System.out.println("Rezultatul este " +calculatorString.verificareaStringDacaEsteImparSauPar(text));
            }else if(optiuneString==5){
                System.out.println("Ati ales optiunea Transformare String in caractere");
                System.out.println("Rezultatul transformari este " + calculatorString.transformareStringInSirCaractere(text));
            }else if(optiuneString==6){
                System.out.println("Ati ales optiunea Verificare string daca incepe cu o vocala");
                System.out.println("Rezultatul este " +calculatorString.dacaStringIncepeCuVocala(text));
            }else if(optiuneString==7){
                System.out.println("Ati ales optiunea numerotare spatii");
                System.out.println("Rezultatul numerotari spatiilor este " +calculatorString.numarSpatiiString(text));
            }
            else {
                System.out.println("Nu exista optiunea introdusa!");
            }
            optiuneString = scanner.nextInt();
        }
        System.out.println("Ati introdus tasta 9.Ati iesit din program.O zi buna!");
    }

}



