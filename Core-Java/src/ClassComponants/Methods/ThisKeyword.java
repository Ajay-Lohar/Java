package ClassComponants.Methods;

public class ThisKeyword {
    int a ;

    void  m1(){
        System.out.println(" call m1 method");
        System.out.println(this.a);// thise key word refer to currant class members
    }

    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword();
        tk.m1();
    }
}
