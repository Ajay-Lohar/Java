package misc.constants;

public interface BiPredicate<X, Y> {
    boolean test(X input1, X input2);

    public static void main(String[] args) {
        BiPredicate biPredicate = (input1, input2) -> input1 == input2;
        System.out.println(biPredicate.test(100, 100));

        BiPredicate<String, String> stringBiPredicate = (str1, str2) -> str1.equalsIgnoreCase(str2);

        System.out.println(stringBiPredicate.test("abc", "Abc"));
    }
}
