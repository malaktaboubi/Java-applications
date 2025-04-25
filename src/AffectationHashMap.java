import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employees, Departments> affectations = new HashMap<>();

    public void ajouterEmployeDepartement(Employees e, Departments d) {
        affectations.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employees, Departments> entry : affectations.entrySet()) {
            System.out.println("Employé : " + entry.getKey() + " -> Département : " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employees e) {
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employees e, Departments d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    public void afficherEmployes() {
        for (Employees e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Departments d : affectations.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employees e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departments d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employees, Departments> trierMap() {
        return new TreeMap<>(affectations);
    }
}
