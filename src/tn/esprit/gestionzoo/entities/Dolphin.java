package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin() {
        super();
        this.swimmingSpeed = 0.0f;
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed=" + swimmingSpeed + " m/s";
    }

    /*@Override
    public void eatmeat(Object MEAT) {
    }*/
}
