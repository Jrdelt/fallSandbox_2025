package employeeType;

public class Employee {
    private String name;
    private String department;
    private char probation;
    private double salary;
    private int years;

    public void employee(String employeeName, String employeeDepartment, char employeeProbation, double employeeSalary, int employeeYears ){
        this.name = employeeName;
        this.department = employeeDepartment;
        this.probation = employeeProbation;
        this.salary = employeeSalary;
        this.years = employeeYears;
    }

    public void employeeInformationOutput(){
        System.out.println("Employee name: " + name + 
        "Employee Department: " + department +
        "Employee Probation Status: " + probation +
        "Employee Salary: " + salary + 
        "Employee Years: " + years
        );
    }

}
