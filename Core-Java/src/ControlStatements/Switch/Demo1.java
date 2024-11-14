package ControlStatements.Switch;

public class Demo1 {
    public static void main(String[] args) {
        int month = 3 ; // mar

        switch (month){
            case 1   ->System.out.println("jan");
            case 2   ->System.out.println("feb");
            case 3   ->System.out.println("mar"); // thise line will be printed
            case 4   ->System.out.println("april");
            case 5   ->System.out.println("may");
            case 6   ->System.out.println("jun");
            case 7   ->System.out.println("july");
            case 8   ->System.out.println("aug");
            case 9   ->System.out.println("supt");
            case 10  ->System.out.println("oct");
            case 11  ->System.out.println("nov");
            case 12  ->System.out.println("disember");
            default  ->System.out.println("invalid month number");
        }


    }
}
