package Arrays;

public class Demo10 {


        //Check the given array alphabet present or not with printing the given alphabets

        public static void main(String[] args) {
            char[] array = {'a','B','Y','4'};
//          char[] array = {};
            boolean isEmpty = false;

            if(array.length == 0){
                isEmpty=true;
            }
            System.out.println(isEmpty?"Empty Contains":"Not Empty Contains");

//            for (char temp : array){
//                if(temp >=0){
//                    isEmpty = true;
//                    System.out.print(temp +" ");
//                }
//            }
//            System.out.println(!isEmpty?"Empty Contains":"Not Empty Contains");
        }
    }





