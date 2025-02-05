package _6_oops.methodOverloading;

public class Demo2 {
    public static void main(String[] args) {
        class Employee {
            int id;
            String name;
            int salary;

            public String getEmployeeDetails() {
                return "Employee{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", salary=" + salary +
                        '}';
            }
        }

        class FTE extends Employee {
            @Override
            public String getEmployeeDetails() {
                return "Employee{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }

        }

        class Contractor extends Employee {
            @Override
            public String getEmployeeDetails() {
                return "Employee{" +
                        ", name='" + name + '\'' +
                        '}';
            }
        }

        Employee employee = new Contractor();
        System.out.println(employee.getEmployeeDetails());
    }
}
