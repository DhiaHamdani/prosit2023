package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;


public class ZooManagement {

    public static void main(String[] args) {
    Zoo Z1 = new Zoo("echkel", "Bizerte");
    Penguin P1=new Penguin("flou", "claude", 12,true, "ocean",50.3f);
        Penguin P3=new Penguin("flou", "red", 22,true, "ocean",14.8f);
        Penguin P2=new Penguin("flou", "red", 22,true, "ocean",82.7f);
        Dolphin D1=new Dolphin("pouf", "claude", 12,true, "ocean",70.3f);

        Z1.addAquaticAnimal(P1);
        Z1.addAquaticAnimal(P2);
        Z1.addAquaticAnimal(P3);
        Z1.addAquaticAnimal(D1);
    for (int i=0;i< Z1.getNbrAquatic();i++) {
        Z1.aquaticAnimals[i].swim();
    }
        System.out.println(Z1.maxPenguinSwimmingDepth());
        Z1.displayNumberOfAquaticsByType();
        System.out.println(D1.equals(P1));
        System.out.println(P2.equals(P3));

    }


}
