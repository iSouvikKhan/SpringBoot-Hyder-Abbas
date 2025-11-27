import java.util.Comparator;

public class EmployeeComparator {

    int id;
    String name;

    public EmployeeComparator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
