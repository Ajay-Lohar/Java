package Oops.finalkeyword;

public class Demo03 {
    public static void main(String[] args) {
        class Student {
          final  int id ;
          final  String name ;

            public Student(){
                this.id =0;
                this.name = "name";
            }
            public Student(int id, String name){
                this.id =id;
                this.name = name;
            }
        }
        Student s1 = new Student(1,"sanjay");
        System.out.println(s1.id +"  "+s1.name);



    }
}
