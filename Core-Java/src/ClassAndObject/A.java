package ClassAndObject;

class A {
    void m1(){}
    static void m2 (){}


    void m3(){
        //call m1 and m2
        this.m1();
        m1();
        A.m2();
        m2();
    }
    static void m4(){

        //call m1 and m2
        A a= new A();
        a.m1();
        A.m2();
        m2();
    }
}
