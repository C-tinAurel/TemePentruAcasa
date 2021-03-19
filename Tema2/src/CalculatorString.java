import java.util.Arrays;

public class CalculatorString {

    public String concatenareStringuri(String text, String text2) {
        return text.concat(text2);
    }

    public int verificareDacaStringulContineUnCaracterAnume(String text, char a) {
        return text.indexOf(a);
    }

    public int sumaADouaStringuri(String text, String text2) {
        int sumaString = text.length() + text2.length();
        return sumaString;
    }

    public String verificareaStringDacaEsteImparSauPar(String text) {
        if (text.length() % 2 == 0) {
            return "Lungimea string-ului este para";
        } else {
            return "Lungimea string-ului este impara";
        }
    }

    public String transformareStringInSirCaractere(String text) {
       String caractere = Arrays.toString(text.toCharArray());
        return caractere;
    }

    public String dacaStringIncepeCuVocala(String text) {
        text.toLowerCase();
        char literaInceput = text.charAt(0);
        if (literaInceput == 'a' || literaInceput == 'e' || literaInceput == 'i' || literaInceput == 'o' || literaInceput == 'u') {
            return "String-ul incepe cu vocala";
        } else {
            return "String-ul nu incepe cu vocala";
        }
    }

    public int numarSpatiiString(String text){
        int numarSpatii=0;
        for(int cursor=0;cursor<text.length();cursor++){
            if(text.charAt(cursor)==' '){
                return numarSpatii++;
            }
        }
        return numarSpatii;
    }
}
