package Arrays;

public class Demo12 {
    public static void main(String[] args) {
        int [][] array1 ={};
        int [][] array2 ={{}};
        int [][] array3 ={{},{}};

        System.out.println("Array1 lenght :- "+array1.length);//0


//_______________________________________________________________________________________________


        System.out.println("Array2 lenght :- "+array2.length);//1

        //inside a array of array
        System.out.println("Array2 lenght :- "+array2[0].length);//0


//________________________________________________________________________________________________
        System.out.println("Array3 lenght :- "+array3.length);//2

        //inside a array of array
        System.out.println("Array3 lenght :- "+array3[1].length);//0


    }
}
