import java.lang.Comparable;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

    int id;
    String name;

    public EmployeeComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(EmployeeComparable aa) {
        return this.id - aa.id;
    }

    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
