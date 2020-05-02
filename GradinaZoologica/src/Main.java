public class Main {
    public static void main(String[] args) {
        //vrem sa creem 2 mamifere 2 erbivore 2 carnivore 3 animale terestre 2 animale


        //Creem doua animale
        Animal animal1 = new Animal("black", 2, "maimuta");
        Animal animal2 = new Animal("red", 4, "tigru");


        //Creem 3 animale terestre
        TerestrialAnimal terestrialAnimal1 = new TerestrialAnimal("green", 0, "snack", "taras", true);
        TerestrialAnimal terestrialAnimal2 = new TerestrialAnimal("grey", 4, "elefant", "merge incet", false);
        TerestrialAnimal terestrialAnimal3 = new TerestrialAnimal("black", 4, "panter", "alearga", true);

        //2 carnivore
        CarnivoreAnimal carnivoreAnimal1 = new CarnivoreAnimal("grey", 4, "wolf", "Alearga", true, true);
        CarnivoreAnimal carnivoreAnimal2 = new CarnivoreAnimal("Blue", 4, "caine", "alearga", false, true);

        //2erbivoare
        ErbivorAnimal erbivorAnimal1 = new ErbivorAnimal("brown", 4, "deer", "alearga", false, true);
        ErbivorAnimal erbivorAnimal2 = new ErbivorAnimal("black", 2, "cow", "merge incet", false, true);

        //2 Mamifere
        Mamel mamel1 = new Mamel("blue", 4, "leopard", "alearga repede", true, 2);
        Mamel mamel2 = new Mamel("rose", 4, "pisica", "alearga repede", true, 3);


        //Vrem sa vedem specia mamifer 2
        System.out.println("Specia mamifer 2 este : " + mamel2.getSpecimen());
        //Vrem sa vedem numarul de membre carnivor 1
        System.out.println("Numar membre carnivor 1: " + carnivoreAnimal1.getMemberNumber());
        //Vrem sa vedem culoarea animal terestru 3
        System.out.println("Culoarea animalului terestru 3: " + terestrialAnimal3.getColor());
        //Vrem sa vedem numar de membre mamifer1
        System.out.println("Numar membre mamifer 1: " + mamel1.getMemberNumber());
        //Vrem sa vedem specimenul carnivor 1
        System.out.println("Specimenul Carnivor 1 :" + carnivoreAnimal1.getSpecimen());
        //Vrem sa vedem numarul de membri erbivor 2
        System.out.println("Numar de membre erbivor nr 2: " + erbivorAnimal2.getMemberNumber());

        //vrem sa creem 2 animale de apa dulce si 2 animale de apa sarata si 2 animale acvatice

        //animale acvatice
        AquaticAnimal aquaticAnimal1 = new AquaticAnimal("blue", 0, 10, "delfin", 3);
        AquaticAnimal aquaticAnimal2 = new AquaticAnimal("silver", 0, 50, "shark", 101);

        // animale de apa dulce
        SweetWaterAnimal sweetWaterAnimal1 = new SweetWaterAnimal("green", 0, 20, "somn", 2);
        SweetWaterAnimal sweetWaterAnimal2 = new SweetWaterAnimal("red", 0, 22, "pastrav", 2);

        //animale de apa sarata
        SaltWaterAnimal saltWaterAnimal1 = new SaltWaterAnimal("grey", 0, 154, "salau", 13544);
        SaltWaterAnimal saltWaterAnimal2 = new SaltWaterAnimal("black", 0, 122, "crap", 10000);

        //sa se arate numarul de membre animal acvatic 2
        System.out.println("Numar de membre animal de apa :" + aquaticAnimal2.getMemberNumber());
        // vrem sa vedem culoarea animal de apa dulce 1
        System.out.println("Culoarea animal apa dulce :" + sweetWaterAnimal1.getColor());
        // vrem sa vedem adancimea animalelor de apa sarata 1 si 2
        System.out.println("Adancime animal sarat :" + saltWaterAnimal1.getDeep());
        System.out.println("Adancime animal sarat :" + saltWaterAnimal2.getDeep());

       aquaticAnimal1.waterAnimal();
       System.out.println("Se afiseaza :" +aquaticAnimal1.waterAnimal());

       sweetWaterAnimal2.waterAnimal();
       System.out.println("Se afiseaza :" +sweetWaterAnimal2.waterAnimal());

       saltWaterAnimal1.waterAnimal();
       System.out.println("Se afiseaza :" +saltWaterAnimal1.waterAnimal());
    }
}
