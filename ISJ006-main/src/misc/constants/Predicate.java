package misc.constants;

public interface Predicate<X> {
    boolean test(X input);

    public static void main(String[] args) {
        Predicate<Integer> predicate = input -> input % 2 == 0;
        System.out.println(predicate.test(100));//true
        System.out.println(predicate.test(155));//false

        Predicate<String> stringPredicate = input -> input.startsWith("A");
        System.out.println("String predicate " + stringPredicate.test("Adnan"));//true
        System.out.println("String predicate " + stringPredicate.test("Onkar"));//false
    }
}
