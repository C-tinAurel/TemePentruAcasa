public class Exercitiul13 {

    public static void main(String[] args) {
        //13.Write a Java program to find the find the word from the middle of a given string.
        String text = "un băiat prizărit pat";
        cuvantulDinMijloculStringului(text);

    }


    public static void cuvantulDinMijloculStringului(String text) {
        String[] desparteString = text.split(" ");
        String cuvantDinMijloc = " ";
            if (desparteString.length % 2 == 0) {
                cuvantDinMijloc=desparteString[desparteString.length/2-1] + " " + desparteString[desparteString.length/2];
                System.out.println(cuvantDinMijloc);
            }else {
                cuvantDinMijloc=desparteString[desparteString.length/2];
                System.out.println(cuvantDinMijloc);
            }

    }
}
