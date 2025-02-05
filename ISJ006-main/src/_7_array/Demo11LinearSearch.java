package _7_array;

public class Demo11LinearSearch {
    public static void main(String[] args) {
        String[] selectedCandidateList = {
                "Aakash", "Akshay", "Swapnil", "Rahul", "Rohan"
        };
        String search = "Rohit";
        boolean isSelected = false;
        for (int index = 0; index < selectedCandidateList.length; index++) {
            if (search.equals(selectedCandidateList[index])) {
                isSelected = true;
                break;
            }
        }
        System.out.println(isSelected ? "Congratulations" : "Better Luck Next time");


    }
}
