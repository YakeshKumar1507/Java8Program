package EmployeeList;

import java.util.Scanner;

public class EmployeeDAO {

    public static void main(String[] args) {

        Employee employee[] = new Employee[3];
        employee[0] = new Employee(101, "Yakesh", "Software Engineer");
        employee[1] = new Employee(107, "Dinesh", "Software Tester");
        employee[2] = new Employee(108, "Lathish", "DevOps Engineer");

        for (Employee e : employee) {
            System.out.println(e.toString());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee id");
        int empId = scanner.nextInt();

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getEmployeeID() == empId) {
                System.out.println(employee[i].getEmployeeID() + " " + employee[i].getEmployeeName() + " " + employee[i].getDesignation());
            }
            else {
                System.out.println("No employee Id present in DAO");
            }
            break;
        }
    }

}
