package _6_oops.accessSpecifiers;

public class Employee {
    int employeeId;
    String employeeName;
    int employeeSalary;
    String address;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int employeeSalary, String address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Rohan", 10000, "Pune");
        Employee employee2 = new Employee(101, "Rohan", 10000, "Pune");
        Employee employee3 = new Employee(101, "Rohan", 10000, "Pune");
        Employee employee4 = new Employee(101, "Rohan", 10000, "Pune");

        System.out.println("ID\t" + "Name\t" + "Salary\t" + "Address");
        System.out.println(employee1.employeeId + "\t" + employee1.employeeName + "\t" + employee1.employeeSalary + "\t" + employee1.address);
        System.out.println(employee2.employeeId + "\t" + employee2.employeeName + "\t" + employee2.employeeSalary + "\t" + employee2.address);
        System.out.println(employee3.employeeId + "\t" + employee3.employeeName + "\t" + employee3.employeeSalary + "\t" + employee3.address);
        System.out.println(employee4.employeeId + "\t" + employee4.employeeName + "\t" + employee4.employeeSalary + "\t" + employee4.address);
        int i = employee2.hashCode();
    }
}
