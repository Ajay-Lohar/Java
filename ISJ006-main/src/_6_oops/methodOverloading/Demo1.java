package _6_oops.methodOverloading;

public class Demo1 {
    public static void main(String[] args) {
        class ArrayList {
            void add(int number1, int number2) {
                System.out.println(number1 + number2);
            }

            void add(int number1, int number2, int number3) {
                System.out.println(number1 + number2 + number3);
            }

            void add(String str1, String str2) {
                System.out.println(str1 + str2);
            }
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(100, 200);
        arrayList.add(100, 200, 300);
        arrayList.add("abc", "pqr");
    }


}
