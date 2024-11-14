package Oops.finalkeyword;

public class Demo06immutablecClass {
    public static void main(String[] args) {
      final  class Person{
           final private  int id ;
           final private String name ;

           public Person(int id,String name){
               this.id =id;
               this.name = name;

           }
        }
        Person person = new Person(1,"Laxman");
//      person.id=2;--> cannot chenge the id

    }
}
