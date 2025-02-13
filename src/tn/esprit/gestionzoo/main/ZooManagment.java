package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import java.util.Scanner;

public class ZooManagment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        int nbrCages = 0;
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

        // Add animals and perform operations
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal hedgehog = new Animal("Erinaceidae", "Hedgehog", 2, true);

        System.out.println("Ajout Lion: " + myZoo.addAnimal(lion));
        System.out.println("Ajout Tiger: " + myZoo.addAnimal(tiger));
        System.out.println("Ajout Lion (test): " + myZoo.addAnimal(lion));

        myZoo.displayAnimals();

        System.out.println("Recherche Lion: " + myZoo.searchAnimal(lion));
        System.out.println("Recherche Hedgehog: " + myZoo.searchAnimal(hedgehog));

        System.out.println("deleting Tiger: " + myZoo.removeAnimal(tiger));
        Animal elephant = new Animal("Proboscidea", "Elephant", 15, true);
        System.out.println("Ajout elephant: " + myZoo.addAnimal(elephant));
        myZoo.displayAnimals();

        myZoo.displayZoo();

        Zoo zoo2 = new Zoo("Wild Park", "Paris");
        zoo2.addAnimal(new Animal("Giraffidae", "Giraffe", 7, true));
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.getName());

        scanner.close();
    }
}