package classComponents.nestedClasses.staticNestedClasses;

public class Book {
    static class FictionBook {
        int fictionBookId = 111;

        public void printFictionBook() {
            System.out.println("Printing fiction book");
        }
    }
}
