public class Main {
    public static void main(String[] args)
    {
       int  number  =10 ;

        int sum= 0;
        for (int i=0 ; i<=number ;i++){
            for (int j=1 ; j<=i ;j++){
                sum= sum+number;
            }
        }
        System.out.println(sum);
    }
}