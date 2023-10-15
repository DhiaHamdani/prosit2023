package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;


public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Carnivore","Lion",21, true);
        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(tn.esprit.gestionZoo.main.entities.Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());

        // Prosit 5

        Aquatic Aquatic_D = new Aquatic("balene" , "leo", 5, true, "ocean");
        Dolphin Dolphin_D = new Dolphin("poisson" , "neon", 7, true, "ocean", 40.6f);
        Penguin Penguin_D = new Penguin("balene" , "hito", 5, true, "ocean", 13.9f);
        Terrestrial Terrestrial_D = new Terrestrial("singe" , "ohoo", 12, true, 4);

        System.out.println(Aquatic_D.toString());
        System.out.println(Dolphin_D.toString());
        System.out.println(Penguin_D.toString());



        Aquatic_D.swim();
        Dolphin_D.swim();
        Penguin_D.swim();      // le penguin n'a pas de methode swim() donc il hérite celle de la classe mere aquatic

    }

}
