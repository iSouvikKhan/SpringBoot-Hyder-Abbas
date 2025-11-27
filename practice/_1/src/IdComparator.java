import java.util.Comparator;

public class IdComparator implements Comparator<EmployeeComparator> {

    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.id - o2.id;
    }
}
