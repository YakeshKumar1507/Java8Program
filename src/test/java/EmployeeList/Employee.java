package EmployeeList;

public class Employee {

     private int employeeID;
     private String employeeName;
     private String designation;

    public Employee(int employeeID, String employeeName, String designation) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.designation = designation;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
