package Arrays;

public class Demo11ToupperCase {

        public static void main(String[] args) {
            char[] array = {'a','b','y','D'};
            //to uppercase

            for (int index = 0; index < array.length ; index++) {
                if(array[index]>='a' || array[index]>='z'){
                    array[index]= (char) (array[index] - 32); // 32 is the askey value
                }

            }
            for (char temp :array){
                System.out.println(temp);
            }




        }
    }







