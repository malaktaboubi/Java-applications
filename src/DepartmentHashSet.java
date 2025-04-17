import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class DepartmentHashSet implements IDepartments <Departments> {

    private Set<Departments> departements = new HashSet<>();

    @Override
    public void ajouterDepartment(Departments d) {
        departements.add(d);
    }


    @Override
    public boolean rechercherDepartment(String nom) {
        for (Departments d : departements) {
            if (d.getNomDep().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartment(Departments d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartment(Departments d) {
        departements.remove(d);
    }

    @Override
    public void displayDepartment() {
        for (Departments d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departments> trierDepartmentById() {
        TreeSet<Departments> sortedSet = new TreeSet<>(Comparator.comparingInt(Departments::getId));
        sortedSet.addAll(departements);
        return sortedSet;
    }
}