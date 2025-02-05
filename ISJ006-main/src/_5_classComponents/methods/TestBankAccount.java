package _5_classComponents.methods;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        System.out.println("After deposit balance is "+ bankAccount.getBalance());
        bankAccount.withdraw(1500);
        System.out.println("After withdraw balance is "+ bankAccount.getBalance());

        //call static method
        System.out.println(BankAccount.getBankDetails());
    }
}
