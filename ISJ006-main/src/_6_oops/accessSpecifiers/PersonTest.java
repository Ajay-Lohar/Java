package _6_oops.accessSpecifiers;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
       // person.name = "John ";
       // person.age = -300;
        //System.out.println(person.name + "\t" + person.age);
        person.setName("John");
        person.setAge(30);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
