import java.util.Objects;

public class Employees {
    private String name;
    private int id;
    private String surname;
    private String department;
    private int grade;

    public Employees(String name, int age, String surname, String department, int grade) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.department = department;
        this.grade = grade;
    }

    public Employees() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int age) {
        this.id = id;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employees)) return false;
        Employees e = (Employees) obj;
        return this.id == e.id && Objects.equals(this.name, e.name);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name +
                ", surname='" + surname +
                ", department='" + department +
                ", grade=" + grade +
                '}';
    }

    
}
