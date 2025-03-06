package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exceptions.ZooFullException;

public class Zoo {
    private static final int MAX_ANIMALS = 3;
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount;
    private Aquatic[] aquaticAnimals;
    private int aquaticcount;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.nbrCages = MAX_ANIMALS;
        this.animals = new Animal[MAX_ANIMALS];
        this.animalCount = 0;
        this.aquaticAnimals = new Aquatic[10];
        this.aquaticcount=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("nom du zoo ne peut pas etre vide");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public void addAnimal(Animal animal) {
        if (animalCount < nbrCages) {
            animals[animalCount] = animal;
            animalCount++;
            System.out.println("Animal added. Total animals are: " + animalCount);
        } else {
            throw new ZooFullException("The zoo is full. Animal can't be added.");
        }
    }


    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--animalCount] = null;
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount > z2.animalCount) ? z1 : z2;
    }

    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entities.Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]");
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticcount < aquaticAnimals.length) {
            aquaticcount++;
            aquaticAnimals[aquaticcount] = aquatic;
        }
        else{
            System.out.println("the zoo is Full :(");
        }
    }

    public void makeAllSwim() {
        for (int i = 0; i < aquaticcount+1 ; i++) {
            Aquatic aquatic = aquaticAnimals[i];
            if (aquatic != null) {
                if (aquatic instanceof Dolphin ) {
                    ((Dolphin)aquatic).swim();
                }
                else {
                    aquatic.swim();
                }
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < aquaticcount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getswimmingDepth() > maxDepth) {
                    maxDepth = penguin.getswimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticcount+1 ; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }


    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}
