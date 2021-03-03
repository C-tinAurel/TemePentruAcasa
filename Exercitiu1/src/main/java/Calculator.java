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
    
}