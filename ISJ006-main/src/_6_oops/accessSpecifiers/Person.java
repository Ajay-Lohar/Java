package _6_oops.accessSpecifiers;

public class Person {
    private int age;
    private String name;

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
