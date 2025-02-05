package classComponents.thisKeyword;

public class Person {
    int id;
    String name;
    public void setPerson(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setPerson(101,"Raju");
        System.out.println("Person ID "+person.id);
        System.out.println("Person Name "+person.name);
        //System.out.println(this.id);//CTE
    }
}
