package operators;

public class LogicalAndOperation {
    public static void main(String[] args) {
        System.out.println("Logical AND");
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && false);//false
        System.out.println(false && true);//false
        //System.out.println(4&&5);//CTE
        System.out.println(2024 % 400 == 0);//false
        System.out.println((2024 % 400 == 0) || (2024 % 100 != 0));//true
        System.out.println((2024 % 400 == 0) || (2024 % 100 != 0 && 2024 % 4 == 0));//true
        System.out.println((2023 % 400 == 0) || (2023 % 100 != 0 && 2023 % 4 == 0));//false
    }
}
