package Arrays;

public class Demo11ToLowerCase {


        public static void main(String[] args) {
            char[] array = {'D','K','A'};
            //to uppercase

            for (int index = 0; index < array.length ; index++) {
                if(array[index]>='A' || array[index]>='Z'){
                    array[index]= (char) (array[index] + 32); // 32 is the askey value
                }

            }
            for (char temp :array){
                System.out.print(temp +" ");
            }




        }
}









