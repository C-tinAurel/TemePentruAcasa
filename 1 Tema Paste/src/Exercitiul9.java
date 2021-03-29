public class Exercitiul9 {

    public static void main(String[] args) {
        //9.Write a Java program to check if the value 20 appears three times in an array
          int[] vectorNumere={20,55,45,20,47,5,20};
         verificareNumar(vectorNumere);
    }

    //9.Verificam daca 20 apare de 3 ori intr-un vector
    public static void verificareNumar(int[] vector) {
        int numarApariti=0;
        for(int cursor=0;cursor<vector.length;cursor++){
           if (vector[cursor]==20){
               numarApariti++;
           }
        }
        if(numarApariti==3){
            System.out.println("Numarul 20 apare de 3 ori in vector");
        }else {
            System.out.println("Numarul 20 nu apare de 3 ori in vector");
        }
    }



    }
