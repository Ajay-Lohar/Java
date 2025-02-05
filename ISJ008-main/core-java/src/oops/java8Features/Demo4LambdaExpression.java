package oops.java8Features;

public class Demo4LambdaExpression {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NumberProcessor {
            int process(int number);
        }

        //1. traditional way
        class Square implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number;
            }
        }
        NumberProcessor square = new Square();
        System.out.println(square.process(20));

        //2. anonymous class
        NumberProcessor cube = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        };
        System.out.println(cube.process(20));

        //3. lambda expression
        NumberProcessor lambda = (int number) -> number * number * number * number;
        System.out.println(lambda.process(3));


    }
}
