package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.Exceptions.ZooFullException;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.Interfaces.*;

import java.util.Scanner;

public class ZooManagment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        int nbrCages;
        while (true) {
            System.out.print("nombre de cages : ");
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                if (nbrCages > 0) {
                    break;
                } else {
                    System.out.println("doit etre un nombre positif");
                }
            } else {
                System.out.println("entrer un nombre valide");
                scanner.next();
            }
        }
        scanner.nextLine();

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        System.out.print("la ville du zoo : ");
        String city = scanner.nextLine();

        Zoo myZoo = new Zoo(zooName, city);


        Animal lion = new Animal("Felidae", "simba", 5, true);
        Animal tiger = new Animal("Felidae", "Tigy", 4, true);
        Animal hedgehog = new Animal("Erinaceidae", "sonic", 2, true);
        Animal elephant = new Animal("Proboscidea", "fatboy", 15, true);
        Terrestrial horse = new Terrestrial("equine", "lilli", 9, true, 4);

        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(tiger);
            myZoo.addAnimal(lion);
            myZoo.addAnimal(elephant);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }


        myZoo.displayAnimals();

        System.out.println("Recherche Lion: " + myZoo.searchAnimal(lion));
        System.out.println("Recherche Hedgehog: " + myZoo.searchAnimal(hedgehog));

        System.out.println("deleting Tiger: " + myZoo.removeAnimal(tiger));

        myZoo.displayAnimals();

        //myZoo.displayZoo();

        Zoo zoo2 = new Zoo("Wild Park", "Paris");

        zoo2.addAnimal(new Animal("Giraffidae", "Giraffe", 7, true));



        Zoo biggerZoo = Zoo.comparerZoo(myZoo, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.getName());


        Dolphin dolphin1 = new Dolphin("Delphinidae", "amine", 8, true, "Ocean", 25.5f);
        Penguin peng1 = new Penguin("Spheniscidae", "melek", 5, false, "Antarctic", 10.2f);
        Penguin peng2 = new Penguin("Spheniscidae", "Pingu", 5, false, "Antarctic", 10.2f);
        Aquatic fish= new Aquatic("Pomacentridae", "nemo", 1, false, "Ocean") {
            @Override
            public void swim() {
                System.out.println("this fish is swimming");
            }
        };


        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(peng1);
        myZoo.addAquaticAnimal(peng2);

        System.out.println(tiger);
        System.out.println(dolphin1);
        System.out.println(peng1);
        System.out.println(peng2);

        myZoo.makeAllSwim();
        myZoo.displayNumberOfAquaticsByType();

        peng2.eatmeat(Food.MEAT);
        fish.eatmeat(Food.MEAT);
        horse.eatplantandmeet(Food.PLANT);

        scanner.close();
    }
}