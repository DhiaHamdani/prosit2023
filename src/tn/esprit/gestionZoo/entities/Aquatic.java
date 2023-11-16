package tn.esprit.gestionZoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal{
    private String habitat ;

    public Aquatic (String family,String name, int age, boolean isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat=habitat;
    }
    public String toString(){
        return super.toString()+ " habitat : " + habitat ;
    }
    public abstract void swim();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aquatic aquatic = (Aquatic) o;
        return Objects.equals(habitat, aquatic.habitat) && Objects.equals(super.getName(), aquatic.getName()) && Objects.equals(super.getAge(), aquatic.getAge());
    }


    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
