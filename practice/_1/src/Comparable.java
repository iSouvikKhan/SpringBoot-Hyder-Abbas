import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {

    public static void main(String[] args) {
        List<EmployeeComparable> emp = new ArrayList<>();
        emp.add(new EmployeeComparable(45, "Souvik"));
        emp.add(new EmployeeComparable(23, "Rana"));
        emp.add(new EmployeeComparable(12, "Rahul"));

        Collections.sort(emp);

        System.out.println(emp);

    }

}
