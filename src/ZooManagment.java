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

        System.out.println(zooName + " comporte " + nbrCages + " cages");
        scanner.close();
    }
}
