package Arrays;

public class Demo7isArrayContainsDigit {
    public static void main(String[] args) {
        char[] array = {'a', 'd', 'e', 'f'};
        boolean isDigit = false;
        for (char temp : array){
            if(temp>='0' && temp <= '9'){
                isDigit = true;
               break;
            }
        }
        System.out.println(isDigit ? "contains Digit ":" Does not contains  Digit");

    }
}