package Inheritance;

public class Demo02 {
    public static void main(String[] args) {


    class Parent {
        Parent(){
            System.out.println(" Parent constructor");
        }
    }
    //singleton Constructor
    class Child extends Parent{
        Child(){
            super();// by default call super  class constructer

     System.out.println(" zero parameterized constructor");
 }
    }
    Child child = new Child();

}
}
