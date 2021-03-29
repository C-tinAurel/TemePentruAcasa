public class Exercitiul17 {

    public static void main(String[] args) {
        //17.Write a Java program to count all “,” and spaces in a text
        String text17 = "Şi ne pomenim într-una din zile că părintele vine la şcoală şi ne aduce un scaun nou şi lung";
        int sumaVirgulaSiSpatii = numarareVirgulaSiSpatii(text17);
        System.out.println("Suma virgulelor si a spatilor este " + sumaVirgulaSiSpatii);
    }

    //17.Numararea "," si a spatiilor
    public static int numarareVirgulaSiSpatii(String text) {
        int sumaVirgulaSiSpatii = 0;
        for (int cursor = 0; cursor < text.length() - 1; cursor++) {
            char caractereCautate = text.charAt(cursor);
            if (caractereCautate == ' ' || caractereCautate == ',') {
                sumaVirgulaSiSpatii++;
            }
        }
        return sumaVirgulaSiSpatii;
    }
}
