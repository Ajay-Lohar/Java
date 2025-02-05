package accessSpecifiers;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person(1, "PK", 22);
        //1. changing the state of an object by accessing the variables directly
        /*person.id = -20;
        person.name = "#$%^^&&***(";
        person.age = -20;

        System.out.println(person.id);
        System.out.println(person.name);
        System.out.println(person.age);*/

        //2. by using public methods
        person.setId(20);
        person.setName("Prathmesh");
        person.setAge(21);

        //3.
        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
