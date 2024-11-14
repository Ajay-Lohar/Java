package Arrays;

public class Demo8 {
// print the only number to given array
        public static void main(String[] args) {
            char[] array = {'a', 'd', 'e', 'f','4','9','2'};
            boolean isDigit = false;
            for (char temp : array){
                if(temp>='0' && temp <= '9'){
                    isDigit = true;
                    System.out.println(temp);
                }
            }

        }
}

