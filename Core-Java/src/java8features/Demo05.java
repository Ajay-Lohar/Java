package java8features;

public class Demo05 {
    public static void main(String[] args) {
        @FunctionalInterface
        interface NumberProcessor{
            int procces(int number);

        }
//        NumberProcessor squre= new NumberProcessor (){
//            @Override
//            public int procces(int number) {
//                return number * number;
//            }
//        };
        NumberProcessor squre=(number) -> number * number;
        NumberProcessor cube=(number) -> number * number*number;

        System.out.println("Squre of the given number "+ squre.procces( 8));
        System.out.println("Cube of the given number "+ cube.procces( 5));
      };
    }

