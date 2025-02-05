package _10_collectionFramework.java8Features;

public class Demo2FunctionalInterfaceAnonymousClassWay {

    //functional interface : which contains single abstract method

    @FunctionalInterface
    interface NumberProcessor {
        //single abstract method
        int process(int number);
    }


    public static void main(String[] args) {
        NumberProcessor ref = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };
        System.out.println(ref.process(15));
    }
}
