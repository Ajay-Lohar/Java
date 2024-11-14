package Arrays;

public class Demo9 {

        //Check the given array alphabet present or not with printing the given alphabets

        public static void main(String[] args) {
            char[] array = {'a', 'd', 'e', 'F','4','9','2'};
            boolean isAlpha = false;
            for (char temp : array){
                if((temp>='a' && temp <= 'z') ||(temp>='A' && temp <= 'Z')){
                    isAlpha = true;
                    System.out.println(temp);
                }
            }
            System.out.println(isAlpha?"contains Alphabet":"does not Contain Alphabet");
        }
    }



