package _10_collectionFramework.java8Features;

public class Demo1FunctionalInterfaceTraditionalWay {

    //functional interface : which contains single abstract method

    @FunctionalInterface
    interface NumberProcessor {
        //single abstract method
        int process(int number);
    }


    public static void main(String[] args) {
        class Subclass1 implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number;
            }
        }

        NumberProcessor ref = new Subclass1();
        System.out.println(ref.process(10));
    }
}
