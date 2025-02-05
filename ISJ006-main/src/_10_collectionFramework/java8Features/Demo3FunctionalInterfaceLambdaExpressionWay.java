package _10_collectionFramework.java8Features;

public class Demo3FunctionalInterfaceLambdaExpressionWay {

    //functional interface : which contains single abstract method

    @FunctionalInterface
    interface NumberProcessor {
        //single abstract method
        int process(int number);
    }


    public static void main(String[] args) {
        NumberProcessor ref = number -> number * number;
        System.out.println(ref.process(25));
    }
}
