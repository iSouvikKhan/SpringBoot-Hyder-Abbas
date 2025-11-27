import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {

    public static void main(String[] args) {
        List<EmployeeComparator> emp = new ArrayList<>();
        emp.add(new EmployeeComparator(45, "Souvik"));
        emp.add(new EmployeeComparator(23, "Rana"));
        emp.add(new EmployeeComparator(12, "Rahul"));

        Collections.sort(emp, new IdComparator());

        System.out.println(emp);
    }

}
