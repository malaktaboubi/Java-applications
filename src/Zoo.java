public class Zoo {
    private static final int MAX_ANIMALS = 25;
    private Animal[] animals;
    private String name;
    public String getName() { return name; }
    private String city;
    private int nbrCages;
    private int animalCount;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbrCages = MAX_ANIMALS;
        this.animals = new Animal[MAX_ANIMALS];
        this.animalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull() || searchAnimal(animal) != -1) {
            return false;
        }
        animals[animalCount++] = animal;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
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
        return animalCount >= MAX_ANIMALS;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount > z2.animalCount) ? z1 : z2;
    }

    public void displayZoo() {
        System.out.println("Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]");
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}
