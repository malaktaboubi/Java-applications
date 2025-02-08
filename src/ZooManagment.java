import java.util.Arrays;
import java.util.Scanner;


public class ZooManagment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        int nbrCages = 0;
        while (true) {
            System.out.print("Entrez le nombre de cages : ");
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                if (nbrCages > 0) {
                    break;
                } else {
                    System.out.println("Veuillez entrer un nombre positif.");
                }
            } else {
                System.out.println("Veuillez entrer un nombre valide.");
                scanner.next();
            }
        }
        scanner.nextLine();
        System.out.println(zooName + " comporte " + nbrCages + " cages");
        System.out.print("Entrez la ville du zoo : ");
        String city = scanner.nextLine();

        Zoo myZoo = new Zoo(zooName, city, nbrCages);
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);

        scanner.close();
    }
}
