package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.Interfaces.Carnivore;
import tn.esprit.gestionzoo.Interfaces.Food;

public abstract class Aquatic extends Animal implements Carnivore<Food>  {
    private String habitat;

    public Aquatic() {
        super();
        this.habitat = "Unknown";

    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();



    @Override
    public String toString() {
        return super.toString() + ", Habitat=" + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic aquatic = (Aquatic) obj;
        return this.getName().equals(aquatic.getName()) && this.getAge() == aquatic.getAge() && this.habitat.equals(aquatic.habitat);
    }

    @Override
    public void eatmeat(Food food) {
        System.out.println("this Aquatic "+ getName() +" is eating "+food);
    }
}

