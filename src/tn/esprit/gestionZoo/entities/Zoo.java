package tn.esprit.gestionZoo.entities;

public class Zoo {

    public Aquatic[] aquaticAnimals = new Aquatic[10];

    static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private int nbrAquatic;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        if ( name=="") {
            System.out.println("ecrire le nom");
        }
        else{
            this.name = name;
        }
        this.city = city;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        aquaticAnimals[nbrAquatic]=aquatic;
        nbrAquatic++;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    public float maxPenguinSwimmingDepth(){
        float max=0f;
        for (int i=0;i<nbrAquatic;i++){
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if(max<penguin.getSwimmingDepth()) {
                    max=penguin.getSwimmingDepth();
                }
            }
            }
        return max;
        }
        public void displayNumberOfAquaticsByType(){
            int nbrPenguin = 0;
            int nbrDolphin = 0;
            for (int i=0; i<nbrAquatic;i++){
                if (aquaticAnimals[i] instanceof Penguin){
                    nbrPenguin++;
                }
                if (aquaticAnimals[i] instanceof Dolphin){
                    nbrDolphin++;
                }
            }
            System.out.println("nombre de Penguins :" + nbrPenguin +"\n nombre de Dolphins : " + nbrDolphin);
        }



    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }



    public int getNbrAquatic() {
        return nbrAquatic;
    }

    public void setNbrAquatic(int nbrAquatic) {
        this.nbrAquatic = nbrAquatic;
    }
}
