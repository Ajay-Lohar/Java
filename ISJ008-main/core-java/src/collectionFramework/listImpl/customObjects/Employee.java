package collectionFramework.listImpl.customObjects;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int salary;
    private String address;
   // private String gender;

    @Override
    public int compareTo(Employee employee) {
        //positive
        //negative
        //zero
       // return employee.salary - this.salary;
        //return this.id - employee.id;
        return this.name.compareTo(employee.name);
    }
}
