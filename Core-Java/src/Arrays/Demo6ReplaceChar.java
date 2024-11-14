package Arrays;

public class Demo6ReplaceChar {
    public static void main(String[] args) {
        char[] character ={'a','d','e','f'};
        char oldChar = 'e';
        char replaceWith = 'E';

        System.out.println("original Array");
        for (int index = 0; index <character.length ; index++) {
            System.out.print(character[index]+" ");
        }


        for (int index = 0 ; index < character.length ;index++){
            if (character[index]==oldChar){
                character[index] = replaceWith;
            }

        }
        System.out.println(" ");
        System.out.println("Replace E  Array");

//        for (int index = 0; index <character.length ; index++) {
//            System.out.print(character[index]+" ,");
//        }

        for (char temp :character){
            System.out.print(temp+" ");
        }

    }
}
