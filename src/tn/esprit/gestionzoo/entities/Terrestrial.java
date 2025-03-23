package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.Interfaces.Food;
import tn.esprit.gestionzoo.Interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore <Food> {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Legs=" + nbrLegs;
    }

    @Override
    public void eatplantandmeet(Food food){
        System.out.println("this terrestrial "+ getName() +" is eating " +food);
    };
}