import java.util.TreeSet;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("qqd",12,new MyDate(2019,12,12));
        Employee e2 = new Employee("qwa",13,new MyDate(2019,12,12));
        Employee e3 = new Employee("qwz",14,new MyDate(2019,12,12));
        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);

        for (Object o : t) {
            System.out.println(o);
        }
    }
}
