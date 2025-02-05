package accessSpecifiers;

public class Person {
    private int id;
    private String name;
    private int age;

    //all args constructor
    // parameterized constructor
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //no-args constructor , zero parameterized constructor
    public Person() {
    }

    //value setting for iv : public setter method
    public  void setId(int id){
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    // public getters method
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
