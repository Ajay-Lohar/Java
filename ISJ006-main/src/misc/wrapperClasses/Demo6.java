package misc.wrapperClasses;

public class Demo6 {
    public static void main(String[] args) {
        char ch = 'A';
        Character character = new Character('a');
        Character character2 = 'B';//autoboxing
        char ch2 = character2; // auto -unboxing

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isAlphabetic('1'));
        System.out.println(Character.isLowerCase('a'));

    }
}
