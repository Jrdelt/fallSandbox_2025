package randomShit.employeeType;

public class Employee {
    private String name;
    private String department;
    private char probation;
    private double salary;
    private int years;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public char getProbation() {
        return this.probation;
    }

    public void setProbation(char probation) {
        this.probation = probation;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYears() {
        return this.years;
    }

    public void setYears(int years) {
        this.years = years;
    }

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
