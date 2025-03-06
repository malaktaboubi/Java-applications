package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exceptions.InvalidAgeException;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {
        this.family = "Unknown";
        this.name = "Unknown";
        this.age = 0;
        this.isMammal = false;
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new InvalidAgeException("L'âge d'un animal ne peut pas être négatif.");
        }
    }

    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
}