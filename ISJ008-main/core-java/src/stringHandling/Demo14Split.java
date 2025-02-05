package stringHandling;

public class Demo14Split {
    public static void main(String[] args) {
        String names = "durwang, trupti, adiya, kartik, dharmaraj, pk, komal, mahesh, navid, kalpesh";
        //delimiter[, "", :,;] -> on what basis we want split the string
        String[] arrayStrings = names.split(", ");
        for (String name : arrayStrings) {
            System.out.println(name);
        }


    }
}
