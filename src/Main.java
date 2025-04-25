public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectation = new AffectationHashMap();

        Employees e1 = new Employees("sonic", 28, "maurice", "IT", 3);
        Employees e2 = new Employees("amy", 25, "rose", "RH", 2);

        Departments d1 = new Departments(101, "Informatique", 10);
        Departments d2 = new Departments(102, "Ressources Humaines", 5);

        affectation.ajouterEmployeDepartement(e1, d1);
        affectation.ajouterEmployeDepartement(e2, d2);

        affectation.afficherEmployesEtDepartements();

        affectation.ajouterEmployeDepartement(e1, d2);

        affectation.afficherEmployesEtDepartements();

        affectation.supprimerEmploye(e2);

        affectation.afficherEmployesEtDepartements();
    }
}
