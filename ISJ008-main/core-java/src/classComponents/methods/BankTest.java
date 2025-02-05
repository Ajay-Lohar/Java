package classComponents.methods;

public class BankTest {
    public static void main(String[] args) {
        // instance method
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit();
        bankAccount.withDraw();

        //static method
        BankAccount.bankDetails();
    }
}
