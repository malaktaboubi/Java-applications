import java.util.Objects;

public class Departments {
    private int id;
    private String nomdep;
    private int nbemployees;


    public Departments() {
    }


    public Departments(int id, String nomdep, int nbemployees) {
        this.id = id;
        this.nomdep = nomdep;
        this.nbemployees = nbemployees;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomDep() { return nomdep; }
    public void setNomDepartement(String nomDepartement) { this.nomdep = nomDepartement; }

    public int getNombreEmployes() { return nbemployees; }
    public void setNombreEmployes(int nombreEmployes) { this.nbemployees = nombreEmployes; }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Departments)) return false;
        Departments d = (Departments) obj;
        return this.id == d.id && Objects.equals(this.nomdep, d.nomdep) ;
    }


    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomdep  +
                ", nombreEmployes=" + nbemployees +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, nomdep);
    }
}
