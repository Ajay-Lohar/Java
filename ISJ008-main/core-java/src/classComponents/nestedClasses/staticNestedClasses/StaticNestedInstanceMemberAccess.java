package classComponents.nestedClasses.staticNestedClasses;

public class StaticNestedInstanceMemberAccess {
    public static void main(String[] args) {
        // static nested class : instance members
        // we are creating object of FictionBook class and not Book class
        Book.FictionBook fictionBook = new Book.FictionBook();
        System.out.println("Fiction Book ID : " + fictionBook.fictionBookId);
        fictionBook.printFictionBook();
    }
}
