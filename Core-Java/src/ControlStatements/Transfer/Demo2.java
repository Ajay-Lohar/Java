package ControlStatements.Transfer;

public class Demo2 {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if (i%5==0){
                continue;// <-- skip the value
            }
            System.out.println(i);
        }
    }
}
