package ControlStatements.Loops;

public class Demo3 {
    public static void main(String[] args) {
        for (int left = 0, right=10 ; left < right ; right-- ,left++ ){
            System.out.println(left + "\t"+ right);
        }
    }
}

//Output :-
//0 10
//1 9
//2 8
//3 7
//4 6
