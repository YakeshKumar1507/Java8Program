package ParallelStreamExample;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class EmployeeDAO {

    static public List<Employee> getListOfEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            list.add(new Employee(i, "employee" + i, "A", (new Random().nextInt(1000 * 1000))));
        }
        return list;
    }

    public static void main(String[] args) {
        //System.out.println(getListOfEmployee());
        long start = 0;
        long end = 0;

        List<Employee> employees = getListOfEmployee();

        // normal
        start = System.currentTimeMillis();
        double salaryWithOutParallelStream = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        System.out.println(salaryWithOutParallelStream);
        end = System.currentTimeMillis();
        System.out.println("Main Stream took MilliSeconds " + (end-start));

        System.out.println("----------------");

        start = System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        System.out.println(salaryWithParallelStream);
        end = System.currentTimeMillis();
        System.out.println("Parallel Stream took MilliSeconds " + (end-start));

        Date currentDate = new Date();
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(currentDate));



    }

}
