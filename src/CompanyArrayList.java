import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompanyArrayList implements IGestion<Employees> {

    private ArrayList<Employees> listeEmployes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employees e) {
        listeEmployes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String name) {
        for (Employees e : listeEmployes) {
            if (e.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employees e) {
        return listeEmployes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employees e) {
        listeEmployes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employees e : listeEmployes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, Comparator.comparingInt(Employees::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, Comparator
                .comparing(Employees::getDepartment)
                .thenComparing(Employees::getGrade));
    }
}

