public class Calculator {

    //sa se calculeze perimetrul unui patrat
    public String calculatorPerimetruPatrat(int latura) {
        int perimetruPatrat = latura * 4;
        return "Perimetrul patratului cu latura " + latura + " este " + perimetruPatrat;
    }

    public String calculatorPerimetruPatrat(double latura) {
        double perimetruPatrat = latura * 4;
        return "Perimetru patratului cu latura " + latura + " este " + perimetruPatrat;
    }

    //sa se calculeze circumferinta unui cerc
    public String calculatorCircumferintaCerc(double diametru) {
        double circumferintaCerc = diametru * 3.14;
        return "Circumferinta cercului cu diametru " + diametru + " este " + circumferintaCerc;
    }


    //sa se verifice intre 3 numere care este cel mai mare
    public String celMaiMareNumar(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return "Numarul cel mai mare este " + num1;

        } else if (num2 >= num1 && num2 >= num3) {
            return "Numarul cel mai mare este " + num2;

        } else {
            return "Numarul cel mai mare este  " + num3;

        }
    }

    //sa se verifice daca un array are elemente
    public boolean verificareElementeVector(int[] numere) {
        System.out.println("Afisam daca un vector are elemente sau nu");
        for (int cursor = 0; cursor < numere.length; cursor++) {
            if (cursor == 0) {
                return true;
            }
        }
        return false;
    }

    //sa se verifice daca un array are  elemente pare
    public int arrayCuVerificareDacaAreElementePare(int[] numere) {
        System.out.println("Afisam daca vectorul are elemente pare");
        int numerePare = 0;
        for (int cursor = 0; cursor < numere.length - 1; cursor++) {
            if (numere[cursor] % 2 == 0) {
                numerePare++;
                System.out.println("afisam dupa conditie " + numere[cursor]);

            }
        }
        return numerePare;
    }


    //sa se verifice daca un array are  de elemente impare
    public int verificareDacaArrayAreNumarImpareDeElemente(int[] numere) {
        System.out.println("Afisam daca vectorul are elemente impare");
        int elementeImpare = 0;
        for (int cursor = 0; cursor < numere.length; cursor++) {
            if (numere[cursor] % 2 != 0) {
                System.out.println("Afisam numerele impare " + numere[cursor]);
                elementeImpare++;

            }
        }
        return elementeImpare;
    }


    public int mijlocArray(int[] numere) {
        int numarInceput=1;
        int numarSfarsit=numere.length+1;
        int mid=numarInceput+(numarSfarsit-numarInceput-1)/2;
        System.out.println("Afisam mijlocul array-ului");
        return mid;
    }
}