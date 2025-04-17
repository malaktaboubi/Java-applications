import java.util.TreeSet;

public interface IDepartments<T> {
        void ajouterDepartment(T t);
        boolean rechercherDepartment(String nom);
        boolean rechercherDepartment(T t);
        void supprimerDepartment(T t);
        void displayDepartment();
        TreeSet<T> trierDepartmentById();
}

